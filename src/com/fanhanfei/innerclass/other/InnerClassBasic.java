package com.fanhanfei.innerclass.other;
/**
* @ClassName: InnerClassBasic 
* @Description: �ڲ�������÷�
* @author junshuaizhang@163.com
* @date 2015��9��17�� ����12:01:51 
*
 */
public class InnerClassBasic {

	private String test;
	private int count;
	
	public class InnerClass{
		public InnerClass(){
			test = "�ڲ���";
			count = 1;
		}
		public void say(){
			System.out.println("�ڲ��ࣺ"+test+","+count);
		}
		
	}
	public static void main(String[] args) {
		InnerClassBasic innerClassBasic = new InnerClassBasic();
		InnerClassBasic.InnerClass innerClass = innerClassBasic.new InnerClass();

		innerClass.say();
	}

}
