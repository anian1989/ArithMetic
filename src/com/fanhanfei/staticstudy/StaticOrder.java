package com.fanhanfei.staticstudy;
/**
 * 
* @ClassName: StaticOrder 
* @Description: ��̬�����;�̬��ʼ����˳��仯����ʼ��˳��ͬ
* @author junshuaizhang@163.com
* @date 2015��9��7�� ����7:18:54 
*
 */
public class StaticOrder {        
    // ��̬����        
    public static TestA a = new TestA();                     
    // ��̬��ʼ����            
    static {        
        System.out.println("��̬��ʼ����");            
    }                     
    // ��̬����        
    public static TestB b = new TestB();                
    public static void main(String[] args) {                
        new StaticOrder();            
    }        
}                
class TestA {            
    public TestA() {        
        System.out.println("Test--A");            
    }        
}                
class TestB {            
    public TestB() {        
        System.out.println("Test--B");            
    }        
}