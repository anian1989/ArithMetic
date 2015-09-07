package com.fanhanfei.enumstudy;
/**
 * 
 * 本类是为了学习枚举
 *
 */
// 枚举是自动继承java.lang.Enum的，所以java.lang.Enum中有的方法枚举中都有
public enum EnumType {
	HEBEI("河北"),BEIJIGN("北京"),TIANJIN("天津");
	
	private String name;
	public String getName() {
		return name;
	}
	EnumType(String name){
		this.name = name;
	}
}
