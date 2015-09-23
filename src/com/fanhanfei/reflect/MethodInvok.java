package com.fanhanfei.reflect;

import java.lang.reflect.Method;

public class MethodInvok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		Class<? extends A> class1 = a.getClass();
		/*
		 * 2.获取方法 名称和参数列表来决定  
		 * getMethod获取的是public的方法
		 * getDelcaredMethod自己声明的方法
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
			System.out.println("---------返回结果："+invoke3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

class A{
	public void print(){
		System.out.println("=========== 打印");
	}
	
	public void print(int a,int b){
		System.out.println("===============打印int："+(a+b));
	}
	
	public String print(String a){
		System.out.println("===============打印字符："+a);
		return a.toUpperCase();
	}
}
