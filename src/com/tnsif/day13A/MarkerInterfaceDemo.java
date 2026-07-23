package com.tnsif.day13A;

interface Student {

}

class DemoStudent implements Student {

	void show() {
		System.out.println("Marker Interface Example");
	}
}

public class MarkerInterfaceDemo {

	public static void main(String[] args) {

		DemoStudent obj = new DemoStudent();
		obj.show();

	}

}