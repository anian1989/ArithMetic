package com.fanhanfei.synchronizedstudy.U;

import com.fanhanfei.synchronizedstudy.U.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {

		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("username");
		publicClass.setPassword("password");
		System.out.println(publicClass.getUsername()+"  "
				+publicClass.getPassword());
		PrivateClass privateClass = publicClass.new PrivateClass();//注意此调用方式
		privateClass.setAge("age");
		privateClass.setAddress("address");
		System.out.println(privateClass.getAge() + "  "+privateClass.getAddress());
	}

}
