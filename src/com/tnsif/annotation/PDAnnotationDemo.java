package com.tnsif.annotation;

import java.util.ArrayList;
import java.util.List;

public class PDAnnotationDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List al = new ArrayList();
		Student s2 = new Student(102, "Rashmi", "ECE");
		al.add(s2);
		al.add(10);
		al.add("India");
		al.add(new Student(103,"Hari","CS"));

	}

}