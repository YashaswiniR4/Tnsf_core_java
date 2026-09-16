package com.tnsif.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		//Student s=c.getBean("student",Student.class);
		//Student s1=c.getBean("student1",Student.class);
		Student s2=c.getBean("student2",Student.class);
		//s.display();
		//s1.display();
		s2.display();

	}

}
