package com.fanhanfei.staticstudy;
/**
 * 
* @ClassName: StaticOrder 
* @Description: 静态变量和静态初始化块顺序变化，初始化顺序不同
* @author junshuaizhang@163.com
* @date 2015年9月7日 下午7:18:54 
*
 */
public class StaticOrder {        
    // 静态变量        
    public static TestA a = new TestA();                     
    // 静态初始化块            
    static {        
        System.out.println("静态初始化块");            
    }                     
    // 静态变量        
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