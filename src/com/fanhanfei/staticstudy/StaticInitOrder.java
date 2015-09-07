package com.fanhanfei.staticstudy;

/**
 * 
 * @ClassName: StaticInitOrder
 * @Description: 学习Static初始化顺序
 * @author junshuaizhang@163.com
 * @date 2015年9月7日 下午5:50:55
 * 
 */
public class StaticInitOrder {
	public String field = "变量";
	public static String staticField = "静态变量";
	// 静态初始化块
	static {
		System.out.println(staticField);
		System.out.println("静态初始化块");
	}
	
	// 初始化块
	{
		System.out.println(field);
		System.out.println("初始化块");
	}

	public StaticInitOrder() {
		System.out.println("构造函数");
	}

	public static void main(String[] args) {
		new StaticInitOrder();
	}

}
