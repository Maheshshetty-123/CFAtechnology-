package org.jsp.student_marks_spring_boot.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String std;
private int sub1;
private int sub2;
private int sub3;
private int sub4;
private int sub5;
private int sub6;
private double percentage;

public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStd() {
	return std;
}
public void setStd(String std) {
	this.std = std;
}
public int getSub1() {
	return sub1;
}
public void setSub1(int sub1) {
	this.sub1 = sub1;
}
public int getSub2() {
	return sub2;
}
public void setSub2(int sub2) {
	this.sub2 = sub2;
}
public int getSub3() {
	return sub3;
}
public void setSub3(int sub3) {
	this.sub3 = sub3;
}
public int getSub4() {
	return sub4;
}
public void setSub4(int sub4) {
	this.sub4 = sub4;
}
public int getSub5() {
	return sub5;
}
public void setSub5(int sub5) {
	this.sub5 = sub5;
}
public int getSub6() {
	return sub6;
}
public void setSub6(int sub6) {
	this.sub6 = sub6;
}
}
