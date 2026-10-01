package com.domain;

public class Student {
	private int rollno;
	private String name;
	private double marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return String.format("%d %s %.2f", rollno, name, marks);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return this.rollno == other.rollno;
	}
	

}
