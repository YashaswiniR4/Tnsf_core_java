package com.tnsif.annotation;

import java.lang.annotation.Annotation;

public class AnnotationDemo {
	
	public static void main(String[] args) {
		AndroidSeries obj = new AndroidSeries("A23", 14);
		System.out.println(obj.model);
		System.out.println(obj.screenSize);
		@SuppressWarnings("rawtypes")
		Class c = obj.getClass();
		System.out.println(c);
		@SuppressWarnings("unchecked")
		Annotation an=c.getAnnotation(SmartTV.class);
		System.out.println(an);
		SmartTV s = (SmartTV) an;
		System.out.println(s.os());
		
		System.out.println(s.height());
		System.out.println(s.width());

	}

}