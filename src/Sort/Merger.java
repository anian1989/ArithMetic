package Sort;

import java.util.Random;

/**
 * <p>
 * Description: �鲢����ĸ���ʵ�ַ�ʽ
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2015��4��14�� ����11:58:27
 * Project Name: ArithMetic
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date:2015��4��14��            $      $Author: zhangjunshuai$          $Rev:1.0 $         
 * </pre>
 *
 */
/**
 * <p>
 * Description: 
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2015��4��21�� ����5:54:09
 * Project Name: ArithMetic
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date:2015��4��21��            $      $Author: zhangjunshuai$          $Rev:1.0 $         
 * </pre>
 *
 */
public class Merger {
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
	 * ԭ�ع鲢����˼���ǣ�
	 * �����Ƚϵ������ȿ����������������b[Size]�У�Ȼ����й鲢�����ٸ��ƻ�a������
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��14�� ����12:10:05
	 * @param a
	 * @param Size
	 * @param start
	 * @param end
	 */
	
	private static void localMerge(Comparable[] a,int start,int middile,int end){
		//��a[start....middle]��a[middle+1....end]�ϲ�
		int length = end - start +1;
		Comparable[] b = new Comparable[length] ;
		for(int i = 0;i<length;i++){
			b[i] = a[start+i];
		}
		int h = 0,y = middile - start+1;
		for(int j = 0;j<length;j++){
			if(h>(middile - start)){
				a[start+j] = b[y++];
			}else{
				if(y>=b.length){
					a[start+j] = b[h++];
				}else{
					if(b[h].compareTo(b[y])<0)
						a[start+j] = b[h++];
					else
						a[start+j] = b[y++];
				}
			}
		}
	}
	
	/**
	 * <p>
	 * ʵ��ԭ�ؽ����鲢����
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��14�� ����4:49:14
	 */
	private static void ShowLocalMerge(Comparable[] a){
		
		int Bsize =1;//����
		do{
			int start = 0;
			int middile = 0;
			int end = 0;
			while(start < a.length){
				 middile = start + Bsize-1;
				 end = start +2*Bsize - 1;
				if(end >=a.length)//��Ҫ�����ܳ�
						end = a.length -1;
				if(middile < end)//��ֹ���ֻ��һ�������
					localMerge(a,start,middile,end);
				start = end+1;
			}
			System.out.println("--------������"+Bsize);
			Bsize = 2*Bsize ;
		}while(Bsize<a.length);
		show(a);
	}
	
	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��14�� ����5:27:31
	 * @param a
	 * @param lo
	 * @param hi
	 */
	private static void TopEnd(Comparable[]a,int lo,int hi){
		if(hi <= lo) return;
		int mid = lo + (hi  -lo)/2;
		TopEnd(a,lo,mid);//����������
		TopEnd(a,mid+1,hi);//���Ұ������
		localMerge(a,lo,mid,hi);//�鲢���
	}
	/**
	 * <p>
	 * ���¶��ϵ�����
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��21�� ����5:54:23
	 * @param a
	 */
	public static void EndToUp(Comparable[] a){
		int N = a.length;
		Comparable[] aux = new Comparable[N];
		for(int sz = 1;sz < N;sz = sz+sz){
			for(int lo = 0; lo < N -sz;lo+=sz+sz)
				localMerge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1, N-1));
		}
	}
	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015��4��14�� ����4:48:36
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int rondomsize = random.nextInt(1000);
		Integer[] a = new Integer[rondomsize];
		for(int w =0;w<rondomsize;w++){
			a[w] = random.nextInt(rondomsize+w);
		}
		//ShowLocalMerge(a);
		EndToUp(a);
		show(a);
	}

}
