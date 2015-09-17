package com.fanhanfei.innerclass.other;
/**
* @ClassName: Local 
* @Description: �ֲ��ڲ���()
* @author junshuaizhang@163.com
* @date 2015��9��17�� ����4:20:02 
*
 */
public class Local {

	// ���ඨ�嵽������
	public LocalInnerClassForMethod use(final String outword){
		class LocalInnerClassForMethodUse implements LocalInnerClassForMethod{

			@Override
			public void sayHello(String word) {
				
				System.out.println("�ֲ��ڲ���"+outword);
			}
		}
		return new LocalInnerClassForMethodUse();
	}
	
	// ���ڲ���ŵ���������
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
			InDomain inDomain = new InDomain("��������");
			String id = inDomain.getId();
			System.out.println(id);
		}
	}
	
	
	
	public static void main(String[] args) {
		Local local = new Local();
		LocalInnerClassForMethod use = local.use("���ձ���");

		use.sayHello("12312");
		
		inmethodtest(true);
	}

}

interface LocalInnerClassForMethod{
	public void sayHello(String word);
}
