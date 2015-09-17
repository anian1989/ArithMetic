package com.fanhanfei.innerclass.other;
/**
* @ClassName: StaticInnerClass 
* @Description: 静态内部类 
* @author junshuaizhang@163.com
* @date 2015年9月17日 下午6:05:21 
*
 */

public class StaticInnerClass {

	private String sex;
	public static String name = "static_out";
	/**
	 * 
	* @ClassName: InnerStatic 
	* @Description: 静态内部类
	* @author junshuaizhang@163.com
	* @date 2015年9月17日 下午6:10:53 
	*
	 */
	static class InnerStatic{
		public static String innername = "static_inner";
		
		public void display(){
			/**
			 * 静态内部类只能访问外部类的静态成员变量和方法
			 * 不能访问外部类的非静态成员变量和方法
			 */
			System.out.println("外部静态变量："+name);
		}
	}
	
	
	class Innerclass{
		public  String nameLocal = "nameLocal";
		/* 非静态内部类中不能存在单纯的静态成员，可以存在final成员包括final static*/
		public static final String nameLocal_final = "nameLocal";
		
		public void display(){
			System.out.println("外部静态变量2："+name);
		}
		
	}
	
	/**
	 * 
	 * @Description:外部类方法
	 * void
	 * @exception:
	 * @author: zhangjunshuai
	 * @time:2015年9月17日 下午6:34:38
	 */
	public void display(){
		/* 外部类访问静态内部类的静态变量   */
		System.out.println(InnerStatic.innername);
		/* 静态内部类 可以直接创建实例不需要依赖外部类  */
		new InnerStatic().display();
		
		/* 非静态内部类的创建需要依赖于外部类的实例 */
		StaticInnerClass.Innerclass inner2 = new StaticInnerClass().new Innerclass();
		
		System.out.println(inner2.nameLocal);
		inner2.display();
	}
	
	
	public static void main(String[] args) {
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.display();

	}

}
