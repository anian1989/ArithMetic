package com.fanhanfei.reflect;

public class ClassDemo1 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		
		//--------------获取class类的方式 start ---------------
		//说明：Class后面的泛型说明了，三种方式可取的对象范围
		//1、直接通过类获取
		Class<Demo> class1 = Demo.class;

		//2、已知该类的对象获取class
		Class<? extends Demo> class2 = demo.getClass();
		
		System.out.println(class1==class2);
		
		//3、通过类全称，使用Class.forName()
		Class<?> class3 = null;
		try {
			class3 = Class.forName("com.fanhanfei.reflect.Demo");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//--------------获取class类的方式 end ---------------
		
		//-------通过类的类类型创建该类的对象实例 start --------------------
		try {
			Demo newInstance = class1.newInstance();//需要有无参数的构造方法
			newInstance.print();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//-------通过类的类类型创建该类的对象实例 end --------------------
	}

}

class Demo{
	public void print(){
		System.out.println("-------------对象---------------");
	}
}
