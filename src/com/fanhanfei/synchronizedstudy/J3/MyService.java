package com.fanhanfei.synchronizedstudy.J3;
/**
 * 
* @ClassName: MyService 
* @Description: ��֤�����ע��synchronized (list)��ʹ��
* @author junshuaizhang@163.com
* @date 2015��11��5�� ����7:10:56 
*
 */
public class MyService {

	public MyOneList addServiceMethod(MyOneList list,String data){
		try {
			synchronized (list) {
				if(list.getSize() < 1){
					Thread.sleep(2000);
					list.add(data);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
