package com.fanhanfei.enumstudy;

public class EnumTestMain {

	
	public static void main(String[] args) {
		//1.测试values()方法
		System.out.println("--------------------1----------------");
		for (EnumType string : EnumType.values()) {
			System.out.println(string.getName());
		}
		//2. ordinal()方法: 返回枚举值在枚举类种的顺序。这个顺序根据枚举值声明的顺序而定。
		System.out.println("--------------------2----------------");
		System.out.println(EnumType.BEIJIGN.ordinal());
		
		//3. compareTo()方法: Enum实现了java.lang.Comparable接口，因此可以比较象与指定对象的顺序。
		//   Enum中的compareTo返回的是两个枚举值的顺序之差。
		//   当然，前提是两个枚举值必须属于同一个枚举类，否则会抛出ClassCastException()异常。(具体可见源代码)
		System.out.println("--------------------3----------------");
		System.out.println(EnumType.BEIJIGN.compareTo(EnumType.TIANJIN));
		
		// 4. toString()返回枚举常量的名称。
		System.out.println("--------------------4----------------");
		System.out.println(EnumType.HEBEI.toString());
		
		// 5. valueOf()方法： 这个方法和toString方法是相对应的，返回带指定名称的指定枚举类型的枚举常量。
		System.out.println("--------------------5----------------");
		System.out.println(EnumType.valueOf("TIANJIN").getName());
		
		// 6. equals()方法： 比较两个枚举类对象的引用。
		System.out.println("--------------------6----------------");
		System.out.println(EnumType.HEBEI.equals(EnumType.TIANJIN));
		//因为枚举声明定义的类型是一个类，它的变量就是对应实例，所以在比较两个枚举类型的值的时，不需要调用equals，
		//而直接使用“==”就可以
		System.out.println(EnumType.HEBEI==EnumType.valueOf("HEBEI"));
	}

}
