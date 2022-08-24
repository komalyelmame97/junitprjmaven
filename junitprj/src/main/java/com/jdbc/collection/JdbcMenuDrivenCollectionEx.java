package com.jdbc.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JdbcMenuDrivenCollectionEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		System.out.println("Database connection granted");
		int choice;
		do {
			
			System.out.println("Press 1 to insert Multiple Record");
			System.out.println("Press 2 insert single record");
			System.out.println("Press 3 to select record ");
			System.out.println("Press 4 to delete record ");
			System.out.println("Press 5 to update record ");
			System.out.println("Press 6 to exit Record ");
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				List<Student>li = new ArrayList<Student>();
				String sql ="insert into student values(?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
			
				
				li.add(new Student(22, "komal1", "Pune", "BSC",20));
//				li.add(new Student(9,"Sona", "Pune", "BSC",20));
//				li.add(new Student(21,"Janu1", "Pune", "BSC",20));
//				li.add(new Student(15,"Chinu", "Pune", "BSC",30));
				
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
				int []arr = ps.executeBatch();
				System.out.println(Arrays.toString(arr));
				break;
				
			case 2:
				PreparedStatement ps1 = conn.prepareStatement("insert into student values(?,?,?,?,?)");
				System.out.println("Enter student id");
				int sid = sc.nextInt();
				System.out.println("Enter student name");
				String snm = sc.next();
				System.out.println("Enter student city");
				String ccity = sc.next();
				System.out.println("Enter student degree");
				String degree = sc.next();
				System.out.println("Enter student age");
				int age = sc.nextInt();
				Student s1 = new Student();
				s1.setSid(sid);
				s1.setSnm(snm);
				s1.setScity(ccity);
				s1.setDegree(degree);
				s1.setAge(age);
				ps1.setInt(1, s1.getSid());
				ps1.setString(2, s1.getSnm());
				ps1.setString(3, s1.getScity());
				ps1.setString(4, s1.getDegree());
				ps1.setInt(5, s1.getAge());
				ps1.executeUpdate();
				System.out.println("Single record inserted successfully");
				
				break;
				
			case 3:
				PreparedStatement pre = conn.prepareStatement("select * from student");
				ResultSet rs = pre.executeQuery();
				System.out.println("get student records:");
				List<Student>li2 = new ArrayList<Student>();
				
				while(rs.next())
				{
					Student s = new Student();
					s.setSid(rs.getInt(1));
					s.setSnm(rs.getString(2));
					s.setScity(rs.getString(3));
					s.setDegree(rs.getString(4));
					s.setAge(rs.getInt(5));
					li2.add(s);
					
					
				}
				for(Student s : li2)
				{
					System.out.println("sid:"+s.getSid());
					System.out.println("snm:"+s.getSnm());
					System.out.println("scity:"+s.getScity());
					System.out.println("degree:"+s.getDegree());
					System.out.println("age:"+s.getAge());
					
				}
				rs.close();
				break;
			case 4:
				PreparedStatement ps2 = conn.prepareStatement("Delete from student where sid = ?");
				System.out.println("Enter Student id that want to delete");
				int sid1 = sc.nextInt();
				ps2.setInt(1, sid1);
				ps2.executeUpdate();
				System.out.println("Record with specific sid is deleted sucessfully");
				break;
				
			case 5:
				PreparedStatement ps3 = conn.prepareStatement("Update student snm=?,scity=?,degree=?,age=? where sid=?");
				System.out.println("Enter student name");
				String snm1 = sc.next();
				System.out.println("Enter student city");
				String ccity1 = sc.next();
				System.out.println("Enter student degree");
				String degree1 = sc.next();
				System.out.println("Enter student age");
				int age1 = sc.nextInt();
				ps3.executeUpdate();
				System.out.println("Record Update sucessfully");
				break;



				

			}
		}while (choice != 6);
		conn.close();
	}

}
