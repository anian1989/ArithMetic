package com.fanhanfei.staticstudy;
/**
 * 
* @ClassName: SonAndParent 
* @Description: ���ڼ̳й�ϵʱ�ĳ�ʼ��˳��
* @author junshuaizhang@163.com
* @date 2015��9��7�� ����6:58:44 
*
 */
public class SonAndParent extends Father{

	public static String son_staticfileld ="����--��̬����";
	public String son_field = "����--����";
	//��̬��ʼ����
	static{
		System.out.println(son_staticfileld);
		System.out.println("���ࡪ����̬��ʼ����");
	}
	//ʵ������ʼ����
	{
		System.out.println(son_field);
		System.out.println("���ࡪ��ʵ����ʼ����");
	}
	
	public SonAndParent(){
		System.out.println("����--������");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SonAndParent();
	}

}

class Father{
	public static String father_staticfileld ="����--��̬����";
	public String father_field = "����--����";
	//��̬��ʼ����
	static{
		System.out.println(father_staticfileld);
		System.out.println("���ࡪ����̬��ʼ����");
	}
	//ʵ������ʼ����
	{
		System.out.println(father_field);
		System.out.println("���ࡪ��ʵ����ʼ����");
	}
	
	public Father(){
		System.out.println("����--������");
	}
}