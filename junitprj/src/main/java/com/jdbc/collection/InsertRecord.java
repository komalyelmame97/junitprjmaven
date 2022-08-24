package com.jdbc.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InsertRecord {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		List<Student>li = new ArrayList<Student>();
		li.add(new Student(8, "komal", "Pune", "BSC",20));
		li.add(new Student(9,"Sona", "Pune", "BSC",20));
		li.add(new Student(10,"Janu", "Pune", "BSC",20));
		li.add(new Student(11,"Chinu", "Pune", "BSC",30));
		
		String sql ="insert into student values(?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
		PreparedStatement ps = conn.prepareStatement(sql);
		System.out.println("Database connection granted");
		for(Iterator<Student>iterator = li.iterator();iterator.hasNext();)
		{
			Student s=(Student)iterator.next();
		ps.setInt(1,s.getSid())	;
		ps.setString(2,s.getSnm());
		ps.setString(3,s.getScity());
		ps.setString(4, s.getDegree());
		ps.setInt(5,s.getAge());
		ps.addBatch();
		
		}
		int []a = ps.executeBatch();
		System.out.println(Arrays.toString(a));
		
				
	}

}
