package com.fanhanfei.staticstudy;
/**
 * 
* @ClassName: SonAndParent 
* @Description: 存在继承关系时的初始化顺序
* @author junshuaizhang@163.com
* @date 2015年9月7日 下午6:58:44 
*
 */
public class SonAndParent extends Father{

	public static String son_staticfileld ="子类--静态变量";
	public String son_field = "子类--变量";
	//静态初始化块
	static{
		System.out.println(son_staticfileld);
		System.out.println("子类——静态初始化块");
	}
	//实例化初始化块
	{
		System.out.println(son_field);
		System.out.println("子类——实例初始化块");
	}
	
	public SonAndParent(){
		System.out.println("子类--构造器");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SonAndParent();
	}

}

class Father{
	public static String father_staticfileld ="父类--静态变量";
	public String father_field = "父类--变量";
	//静态初始化块
	static{
		System.out.println(father_staticfileld);
		System.out.println("父类——静态初始化块");
	}
	//实例化初始化块
	{
		System.out.println(father_field);
		System.out.println("父类——实例初始化块");
	}
	
	public Father(){
		System.out.println("父类--构造器");
	}
}