package com.tnsif.springdiobjectinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		Student s=c.getBean("student3",Student.class);
		s.cheating();

	}

}
