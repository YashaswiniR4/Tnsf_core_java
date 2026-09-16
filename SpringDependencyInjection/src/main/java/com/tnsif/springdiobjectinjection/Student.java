package com.tnsif.springdiobjectinjection;

public class Student {
private MathCheat chit;


public void setChit(MathCheat chit) {
	this.chit = chit;
}

public void cheating() {
	chit.mathCheat();
}
}
