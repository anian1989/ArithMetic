package com.fanhanfei.innerclass.other;
/**
* @ClassName: StaticInnerClass 
* @Description: ��̬�ڲ��� 
* @author junshuaizhang@163.com
* @date 2015��9��17�� ����6:05:21 
*
 */

public class StaticInnerClass {

	private String sex;
	public static String name = "static_out";
	/**
	 * 
	* @ClassName: InnerStatic 
	* @Description: ��̬�ڲ���
	* @author junshuaizhang@163.com
	* @date 2015��9��17�� ����6:10:53 
	*
	 */
	static class InnerStatic{
		public static String innername = "static_inner";
		
		public void display(){
			/**
			 * ��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա�����ͷ���
			 * ���ܷ����ⲿ��ķǾ�̬��Ա�����ͷ���
			 */
			System.out.println("�ⲿ��̬������"+name);
		}
	}
	
	
	class Innerclass{
		public  String nameLocal = "nameLocal";
		/* �Ǿ�̬�ڲ����в��ܴ��ڵ����ľ�̬��Ա�����Դ���final��Ա����final static*/
		public static final String nameLocal_final = "nameLocal";
		
		public void display(){
			System.out.println("�ⲿ��̬����2��"+name);
		}
		
	}
	
	/**
	 * 
	 * @Description:�ⲿ�෽��
	 * void
	 * @exception:
	 * @author: zhangjunshuai
	 * @time:2015��9��17�� ����6:34:38
	 */
	public void display(){
		/* �ⲿ����ʾ�̬�ڲ���ľ�̬����   */
		System.out.println(InnerStatic.innername);
		/* ��̬�ڲ��� ����ֱ�Ӵ���ʵ������Ҫ�����ⲿ��  */
		new InnerStatic().display();
		
		/* �Ǿ�̬�ڲ���Ĵ�����Ҫ�������ⲿ���ʵ�� */
		StaticInnerClass.Innerclass inner2 = new StaticInnerClass().new Innerclass();
		
		System.out.println(inner2.nameLocal);
		inner2.display();
	}
	
	
	public static void main(String[] args) {
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.display();

	}

}
