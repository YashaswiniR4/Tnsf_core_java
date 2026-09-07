package com.tnsif.annotation;

public @interface SmartPhone {
	String os() default "Android";
	int version() default 1;
}