package com.fanhanfei.synchronizedstudy.U;
/**
 * 
* @ClassName: PublicClass 
* @Description: 内置类（如果调用类不在此包，PrivateClass需要声明成public公开的）
* @author junshuaizhang@163.com
* @date 2015年11月9日 下午7:10:35 
*
 */
public class PublicClass {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	class PrivateClass{
		private String age;
		private String address;
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void printPublicProperty(){
			System.out.println(username+" "+password);
		}
	}
}
