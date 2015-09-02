package com.fanhanfei.annotation;

public class Person {
	private String name;
	
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Deprecated
	public void setAge(int age) {
		this.age = age;
	}
	
	public String PsersontoString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
