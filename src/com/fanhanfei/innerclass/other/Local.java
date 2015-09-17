package com.fanhanfei.innerclass.other;
/**
* @ClassName: Local 
* @Description: 局部内部类()
* @author junshuaizhang@163.com
* @date 2015年9月17日 下午4:20:02 
*
 */
public class Local {

	// 将类定义到方法中
	public LocalInnerClassForMethod use(final String outword){
		class LocalInnerClassForMethodUse implements LocalInnerClassForMethod{

			@Override
			public void sayHello(String word) {
				
				System.out.println("局部内部类"+outword);
			}
		}
		return new LocalInnerClassForMethodUse();
	}
	
	// 将内部类放到作用域内
	public static void inmethodtest(boolean b){
		if(b){
			class InDomain{
				private String id;
				InDomain(String s){
					id =s;
				}
				String getId(){
					return id;
				}
			}
			InDomain inDomain = new InDomain("作用域内");
			String id = inDomain.getId();
			System.out.println(id);
		}
	}
	
	
	
	public static void main(String[] args) {
		Local local = new Local();
		LocalInnerClassForMethod use = local.use("最终变量");

		use.sayHello("12312");
		
		inmethodtest(true);
	}

}

interface LocalInnerClassForMethod{
	public void sayHello(String word);
}
