package Sort;
/**
 * 
 * <p>
 * Description: ģ����
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2015��4��3�� ����4:10:49
 * Project Name: ArithMetic
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date:2015��4��3��            $      $Author: zhangjunshuai$          $Rev:1.0 $         
 * </pre>
 *
 */
public class Example {

	public static void sort(Comparable[] a){
		
	}
	/**
	 * <p>
	 * �Ƿ�С��
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��3�� ����4:14:52
	 * @param v
	 * @param w
	 * @return
	 */
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	/**
	 * <p>
	 * ��������
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��3�� ����4:14:32
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void exch(Comparable[] a,int i ,int j){
		 Comparable t = a[i];
		 a[i] = a[j];
		 a[j] = t;
	 }
	/**
	 * <p>
	 * ��ӡ���
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��3�� ����4:19:03
	 * @param a
	 */
	private static void show(Comparable[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	/**
	 * <p>
	 * �ж��Ƿ�����
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��3�� ����4:25:04
	 * @param a
	 * @return
	 */
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
}
