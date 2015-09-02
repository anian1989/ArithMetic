package com.fanhanfei.annotation;

public class JDKOffer extends Person{
	@SuppressWarnings("deprecation")//去除警告
	@Override//重写父类方法
	public void setAge(int age) {
		super.setAge(age);//方法已过时
	}
}
