package com.fanhanfei.innerclass.other;
/**
 * 
* @ClassName: Anonymous 
* @Description: �����ڲ���
* @author junshuaizhang@163.com
* @date 2015��9��16�� ����5:39:25 
*
 */
public class Anonymous {
	public static int ai =0;
	public static innerinterface getInnerinterface(final int i,String name){
		System.out.println(name);
		return new innerinterface(){
			int h = i +8;
			
			@Override
			public int getsum() {
				return h;
			}
		};
	}
	public static innerclass getInnerclass(final int j){
		innerclass innerclass = new innerclass("�����ڲ���"){
			public void out(){
				System.out.println(this.name);
			}
		};
		return innerclass;
	}
	public static void main(String[] args) {
		System.out.println(getInnerinterface(4,"sdfdsf").getsum());
		innerclass innerclass = getInnerclass(7);
		System.out.println(innerclass);

	}

}

interface innerinterface{
	int getsum();
}

class innerclass{
	public String name ;
	public innerclass(String name){
		this.name = name;
	}
}