package com.fanhanfei.reflect;

import java.lang.reflect.Method;

public class MethodInvok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		Class<? extends A> class1 = a.getClass();
		/*
		 * 2.��ȡ���� ���ƺͲ����б�������  
		 * getMethod��ȡ����public�ķ���
		 * getDelcaredMethod�Լ������ķ���
		 */
		try {
			Method method = class1.getMethod("print", int.class,int.class);
			Object invoke = method.invoke(a, 2,3);
			System.out.println("------------------------------");
			Method method2 = class1.getMethod("print");
			Object invoke2 = method2.invoke(a);
			System.out.println("------------------------------");
			Method method3 = class1.getMethod("print", new Class[]{String.class});
			Object invoke3 = method3.invoke(a, "ceshi");
			String str = (String)invoke3;
			System.out.println("---------���ؽ����"+invoke3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

class A{
	public void print(){
		System.out.println("=========== ��ӡ");
	}
	
	public void print(int a,int b){
		System.out.println("===============��ӡint��"+(a+b));
	}
	
	public String print(String a){
		System.out.println("===============��ӡ�ַ���"+a);
		return a.toUpperCase();
	}
}
