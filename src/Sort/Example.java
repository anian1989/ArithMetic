package Sort;
/**
 * 
 * <p>
 * Description: 模板类
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2015年4月3日 下午4:10:49
 * Project Name: ArithMetic
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date:2015年4月3日            $      $Author: zhangjunshuai$          $Rev:1.0 $         
 * </pre>
 *
 */
public class Example {

	public static void sort(Comparable[] a){
		
	}
	/**
	 * <p>
	 * 是否小于
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015年4月3日 下午4:14:52
	 * @param v
	 * @param w
	 * @return
	 */
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	/**
	 * <p>
	 * 交换函数
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015年4月3日 下午4:14:32
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
	 * 打印输出
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015年4月3日 下午4:19:03
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
	 * 判断是否有序
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015年4月3日 下午4:25:04
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
