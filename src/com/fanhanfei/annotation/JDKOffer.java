package com.fanhanfei.annotation;

public class JDKOffer extends Person{
	@SuppressWarnings("deprecation")//ȥ������
	@Override//��д���෽��
	public void setAge(int age) {
		super.setAge(age);//�����ѹ�ʱ
	}
}
