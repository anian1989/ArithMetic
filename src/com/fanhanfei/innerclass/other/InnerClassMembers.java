package com.fanhanfei.innerclass.other;
/**
* @ClassName: InnerClassMembers 
* @Description: 成员内部类
* @author junshuaizhang@163.com
* @date 2015年9月17日 下午3:44:49 
*
 */
public class InnerClassMembers {

	private String str;
	
	public void outDispaly(){
		System.out.println("外部…………");
	}
	
	public class InnerClass{
		public void innerDisplay(){
			str = "内部类使用外部属性";
			System.out.println(str);
			outDispaly();
		}
	}
	
	public InnerClass getInnerClass(){
		return new InnerClass();
	}
	public static void main(String[] args) {
		InnerClassMembers innerClassMembers = new InnerClassMembers();
		InnerClass innerClass = innerClassMembers.getInnerClass();
		innerClass.innerDisplay();

	}

}
