package Sort;

public class ShellSort {

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
	 * ϣ������
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��8�� ����8:51:28
	 * @param a
	 */
	private static void Shell(Comparable[] a){
		int N = a.length/2;
		while(N>0){//�������ж�
			for(int i=0;i<a.length;i++){//��ʼѭ����������
				int M = (a.length-i-1)/N;//����i���滹�ж���N
				for(int j=1;j<=M;j++){//�Բ�������ķ�ʽ��������ΪN����
					for(int h = j;h>0;h--){
						if(less(a[i+h*N],a[i+(h-1)*N]))
							exch(a,i+h*N,i+(h-1)*N);
						else
							h=-1;
					}
				}
			}
			System.out.println("--------------������"+N);
			show(a);
			N =N/2;
		}
	}
	public static void main(String[] args) {
		Integer[] a = {49,38,65,97,76,13,27,49,55,4};
		Shell(a);
	}
	

}
