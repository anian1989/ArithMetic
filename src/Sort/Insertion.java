package Sort;
/**
 * <p>
 * Description: ��������
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2015��4��6�� ����11:12:37
 * Project Name: ArithMetic
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date:2015��4��6��            $      $Author: zhangjunshuai$          $Rev:1.0 $         
 * </pre>
 *
 */
public class Insertion {
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i=1;i<N;i++){
			for(int j = i-1;j>=0&&less(a[j],a[j+1]);j--){
					exch(a,j,j+1);
			}
			show(a);
		}
		
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

	
	public static void main(String[] args) {
		Integer[] a = {1,3,4,5,6,7,23,13,45,25,56,71};
		sort(a);
		/*Character[] b = {'a','b','d','w','e','f','g','y','u','t','q','s','d','l','j','g','g','z'};
		sort(b);*/
	}
}
