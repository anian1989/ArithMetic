package com.fanhanfei.synchronizedstudy.J1;
/**
* @ClassName: Service 
* @Description: synchronized(��this����x��ͬ������� 
* 1���ڶ���̳߳��С������������Ϊͬһ�������ǰ���£�ͬһ��ʱ��ֻ��һ���߳̿���ִ��synchronized(��this����x��ͬ�������Ĵ��룻
* 2�������С������������Ϊͬһ�������ǰ���£�ͬһ��ʱ��ֻ��һ���߳̿���ִ��synchronized����this����x��ͬ��������еĴ��롣
* @author junshuaizhang@163.com
* @date 2015��11��5�� ����5:44:12 
*
 */
public class Service {

	private String usernameParam;
	private String passwordParam;
	
	public void setUsernamePassword(String username,String password){
		try {
			String anyString = new String();//��������Ϊ�ֲ����������н��������첽
			synchronized (anyString) {
			
				System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
						+"��"+System.currentTimeMillis()+"����ͬ����");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
						+"��"+System.currentTimeMillis()+"�뿪ͬ����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
