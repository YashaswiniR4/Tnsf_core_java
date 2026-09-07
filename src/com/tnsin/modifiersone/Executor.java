package com.tnsin.modifiersone;

import com.tnsif.modifiers.Person;

public class Executor{

	public static void main(String[] args) {
		Person p;
		p=new Person(101,"Ranju","Mysore",6364520807L);
		/*
		 * p.name="Ranju"; p.setId(101);
		 */
	
		p.methodOne();
		p=new Person();
		//p.name="Yashu";
		//p.setId(102);
		p.methodOne();

	}

}