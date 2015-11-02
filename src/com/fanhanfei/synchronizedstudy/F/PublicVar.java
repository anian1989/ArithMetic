package com.fanhanfei.synchronizedstudy.F;
//‘‡∂¡Œ Ã‚
public class PublicVar {

	public String username = "A";
	public String password = "AA";
	
	synchronized public void setValue(String username,String password){
		this.username = username;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.password = password;
		System.out.println("setValue method thread name="+Thread.currentThread().getName()
				+" username="+username+" password="+password);
	}
	
	public void getValue(){
		System.out.println("getValue method thread name="+Thread.currentThread().getName()
				+" username="+username+" password="+password);
	}
}
