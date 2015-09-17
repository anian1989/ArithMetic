package com.fanhanfei.innerclass.other;
/**
* @ClassName: InnerClassMembers 
* @Description: ��Ա�ڲ���
* @author junshuaizhang@163.com
* @date 2015��9��17�� ����3:44:49 
*
 */
public class InnerClassMembers {

	private String str;
	
	public void outDispaly(){
		System.out.println("�ⲿ��������");
	}
	
	public class InnerClass{
		public void innerDisplay(){
			str = "�ڲ���ʹ���ⲿ����";
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
