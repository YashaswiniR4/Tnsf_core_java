//Static Keyword

package com.tnsif.day11;

public class Student {

    String name;
    static String collegeName = "Tech High";

    Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Arun");
        Student s2 = new Student("Divya");

        // Instance Variables
        System.out.println(s1.name);
        System.out.println(s2.name);

        // Static Variable
        System.out.println(Student.collegeName);
    }
}