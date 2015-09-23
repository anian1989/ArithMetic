package com.fanhanfei.reflect;

public class ClassDemo1 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		
		//--------------��ȡclass��ķ�ʽ start ---------------
		//˵����Class����ķ���˵���ˣ����ַ�ʽ��ȡ�Ķ���Χ
		//1��ֱ��ͨ�����ȡ
		Class<Demo> class1 = Demo.class;

		//2����֪����Ķ����ȡclass
		Class<? extends Demo> class2 = demo.getClass();
		
		System.out.println(class1==class2);
		
		//3��ͨ����ȫ�ƣ�ʹ��Class.forName()
		Class<?> class3 = null;
		try {
			class3 = Class.forName("com.fanhanfei.reflect.Demo");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//--------------��ȡclass��ķ�ʽ end ---------------
		
		//-------ͨ����������ʹ�������Ķ���ʵ�� start --------------------
		try {
			Demo newInstance = class1.newInstance();//��Ҫ���޲����Ĺ��췽��
			newInstance.print();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//-------ͨ����������ʹ�������Ķ���ʵ�� end --------------------
	}

}

class Demo{
	public void print(){
		System.out.println("-------------����---------------");
	}
}
