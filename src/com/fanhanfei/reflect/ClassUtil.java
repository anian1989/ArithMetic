package com.fanhanfei.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {

	public static void printMethodMessage(Object obj){
		Class<? extends Object> class1 = obj.getClass();
		System.out.println(class1.getName());
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			System.out.println();
			//方法返回值类型
			System.out.print(method.getReturnType());
			
			//方法的名称
			System.out.print(method.getName()+"( ");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> class2 : parameterTypes) {
				System.out.print(class2.getName()+",");
			}
			System.out.print(")");
		}
		
	}
	
	public static void printFiledMessage(Object obj){
		Class<? extends Object> class1 = obj.getClass();
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * Field类封装了关于成员变量的操作
		 * getFields()方法获取的是所有的public的成员变量的信息
		 * getDeclaredFields获取的是该类自己声明的成员变量的信息
		 */
		//Field[] fs = c.getFields();
		Field[] declaredFields = class1.getDeclaredFields();
		for (Field field : declaredFields) {
			Class<?> type = field.getType();//类型
			String name2 = type.getName();//类型名称
			String name = field.getName();//
			System.out.println(name2+"   "+name);
		}
		
		
		
		printConMessage(obj);
	}

	public static void printConMessage(Object obj) {
		Class<? extends Object> class2 = obj.getClass();
		Constructor<?>[] constructors = class2.getConstructors();
		
		for (Constructor<?> constructor : constructors) {
			System.out.println();
			String name = constructor.getName();
			System.out.print(name+"(");
			Class<?>[] parameterTypes = constructor.getParameterTypes();
			for (Class<?> class3 : parameterTypes) {
				System.out.print(class3.getName()+",");
				
			}
			System.out.print(")");
		}
	}
	
	
	
	
	
}
