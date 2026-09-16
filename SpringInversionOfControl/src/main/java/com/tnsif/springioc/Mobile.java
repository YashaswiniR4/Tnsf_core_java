package com.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/*
		 * //tight coupling Airtel a=new Airtel(); a.browsing(); a.calling(); Jio j=new
		 * Jio(); j.browsing(); j.calling(); //Loose coupling
		 */
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		
		
		Sim s=c.getBean("sim",Sim.class);
		s.browsing();
		s.calling();
		} 

}
