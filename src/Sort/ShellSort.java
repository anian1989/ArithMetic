package Sort;

public class ShellSort {

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
	 * 希尔排序
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015年4月8日 下午8:51:28
	 * @param a
	 */
	private static void Shell(Comparable[] a){
		int N = a.length/2;
		while(N>0){//增量的判断
			for(int i=0;i<a.length;i++){//开始循环所有数据
				int M = (a.length-i-1)/N;//计算i后面还有多少N
				for(int j=1;j<=M;j++){//以插入排序的方式排序增量为N的数
					for(int h = j;h>0;h--){
						if(less(a[i+h*N],a[i+(h-1)*N]))
							exch(a,i+h*N,i+(h-1)*N);
						else
							h=-1;
					}
				}
			}
			System.out.println("--------------增量："+N);
			show(a);
			N =N/2;
		}
	}
	public static void main(String[] args) {
		Integer[] a = {49,38,65,97,76,13,27,49,55,4};
		Shell(a);
	}
	

}
