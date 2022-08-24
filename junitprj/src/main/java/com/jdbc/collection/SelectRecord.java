package com.jdbc.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
		PreparedStatement pre = conn.prepareStatement("select * from student");
		List<Student>li = new ArrayList<Student>();
		ResultSet rs = pre.executeQuery();
		
		while(rs.next())
		{
			Student s = new Student();
			s.setSid(rs.getInt(1));
			s.setSnm(rs.getString(2));
			s.setScity(rs.getString(3));
			s.setDegree(rs.getString(4));
			s.setAge(rs.getInt(5));
			li.add(s);
			
			
		}
		for(Student s : li)
		{
			System.out.println("sid:"+s.getSid());
			System.out.println("snm:"+s.getSnm());
			System.out.println("scity:"+s.getScity());
			System.out.println("degree:"+s.getDegree());
			System.out.println("age:"+s.getAge());
			
		}
		

	}

}
