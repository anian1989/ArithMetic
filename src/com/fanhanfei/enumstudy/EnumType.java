package com.fanhanfei.enumstudy;
/**
 * 
 * ������Ϊ��ѧϰö��
 *
 */
// ö�����Զ��̳�java.lang.Enum�ģ�����java.lang.Enum���еķ���ö���ж���
public enum EnumType {
	HEBEI("�ӱ�"),BEIJIGN("����"),TIANJIN("���");
	
	private String name;
	public String getName() {
		return name;
	}
	EnumType(String name){
		this.name = name;
	}
}
