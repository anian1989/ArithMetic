package com.fanhanfei.staticstudy;

/**
 * 
 * @ClassName: StaticInitOrder
 * @Description: ѧϰStatic��ʼ��˳��
 * @author junshuaizhang@163.com
 * @date 2015��9��7�� ����5:50:55
 * 
 */
public class StaticInitOrder {
	public String field = "����";
	public static String staticField = "��̬����";
	// ��̬��ʼ����
	static {
		System.out.println(staticField);
		System.out.println("��̬��ʼ����");
	}
	
	// ��ʼ����
	{
		System.out.println(field);
		System.out.println("��ʼ����");
	}

	public StaticInitOrder() {
		System.out.println("���캯��");
	}

	public static void main(String[] args) {
		new StaticInitOrder();
	}

}
