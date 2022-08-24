package com.jdbc.collection;

public class Student {
private int sid;
private int age;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSnm() {
	return snm;
}
public void setSnm(String snm) {
	this.snm = snm;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
private String snm;
private String scity;
private String degree;
public Student(int sid,String snm, String scity, String degree,int age) {
	super();
	this.sid = sid;
	this.age = age;
	this.snm = snm;
	this.scity = scity;
	this.degree = degree;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}


}
