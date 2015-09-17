package com.fanhanfei.innerclass.other;
/**
* @ClassName: InnerClassBasic 
* @Description: 内部类基本用法
* @author junshuaizhang@163.com
* @date 2015年9月17日 下午12:01:51 
*
 */
public class InnerClassBasic {

	private String test;
	private int count;
	
	public class InnerClass{
		public InnerClass(){
			test = "内部类";
			count = 1;
		}
		public void say(){
			System.out.println("内部类："+test+","+count);
		}
		
	}
	public static void main(String[] args) {
		InnerClassBasic innerClassBasic = new InnerClassBasic();
		InnerClassBasic.InnerClass innerClass = innerClassBasic.new InnerClass();

		innerClass.say();
	}

}
