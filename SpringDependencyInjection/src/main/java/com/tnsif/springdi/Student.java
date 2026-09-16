package com.tnsif.springdi;

public class Student {
	private String studentName;
	private int id;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}

	void display() {
		System.out.println("Student name is "+studentName+id);
	}

}
