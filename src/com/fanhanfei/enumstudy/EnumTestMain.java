package com.fanhanfei.enumstudy;

public class EnumTestMain {

	
	public static void main(String[] args) {
		//1.����values()����
		System.out.println("--------------------1----------------");
		for (EnumType string : EnumType.values()) {
			System.out.println(string.getName());
		}
		//2. ordinal()����: ����ö��ֵ��ö�����ֵ�˳�����˳�����ö��ֵ������˳�������
		System.out.println("--------------------2----------------");
		System.out.println(EnumType.BEIJIGN.ordinal());
		
		//3. compareTo()����: Enumʵ����java.lang.Comparable�ӿڣ���˿��ԱȽ�����ָ�������˳��
		//   Enum�е�compareTo���ص�������ö��ֵ��˳��֮�
		//   ��Ȼ��ǰ��������ö��ֵ��������ͬһ��ö���࣬������׳�ClassCastException()�쳣��(����ɼ�Դ����)
		System.out.println("--------------------3----------------");
		System.out.println(EnumType.BEIJIGN.compareTo(EnumType.TIANJIN));
		
		// 4. toString()����ö�ٳ��������ơ�
		System.out.println("--------------------4----------------");
		System.out.println(EnumType.HEBEI.toString());
		
		// 5. valueOf()������ ���������toString���������Ӧ�ģ����ش�ָ�����Ƶ�ָ��ö�����͵�ö�ٳ�����
		System.out.println("--------------------5----------------");
		System.out.println(EnumType.valueOf("TIANJIN").getName());
		
		// 6. equals()������ �Ƚ�����ö�����������á�
		System.out.println("--------------------6----------------");
		System.out.println(EnumType.HEBEI.equals(EnumType.TIANJIN));
		//��Ϊö�����������������һ���࣬���ı������Ƕ�Ӧʵ���������ڱȽ�����ö�����͵�ֵ��ʱ������Ҫ����equals��
		//��ֱ��ʹ�á�==���Ϳ���
		System.out.println(EnumType.HEBEI==EnumType.valueOf("HEBEI"));
	}

}
