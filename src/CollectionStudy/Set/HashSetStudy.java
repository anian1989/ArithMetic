package CollectionStudy.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * @ClassName: HashSetStudy
 * @Description: HashSetѧϰ����ѧϰ֮ǰ������ѧϰһ��HashMap��Ϊ�ײ�ʵ������HashMap
 * 				 ���ļ̳��������һ����о�
 * @author: zhangjunshuai
 * @date: 2015��6��10�� ����6:51:29
 */
public class HashSetStudy {
	/**
	 * HashSet���ص㣺
			��1��HashSet����ͬ���ģ�����̷߳�������Ҫͨ�����뱣֤ͬ�� 
			��2������Ԫ��ֵ����ʹnull��
	 */
	/**
	 * @Title: add
	 * @Description: HashSet��������ظ��Ķ��󣬵ײ���Mapʵ�ֵ���ʱ����о���
	 * 				 �Զ���Ķ��������ͨ��HashSetȥ������Ҫ��дHashCode������equals������
	 * 				HashSet�ڱȽ�ʱ�ȶԱ�hashCode����hashCode��ͬ������¶Ա�equals
	 * @return: void
	 */
	static Set<Stu> books = new HashSet<Stu>();
	public static void add(){
		Stu stu = new Stu();
		stu.setAge(0);
		stu.setName("1");
		Stu stu2 = new Stu();
		stu2.setAge(0);
		stu2.setName("1");
		books.add(stu);
		System.out.println(books.add(stu2));
		System.out.println(books);
	};
	/**
	 * @Title: clear
	 * @Description: ��գ���ײ��ǵ���map�����
	 * @return: void
	 */
	public static void clear(){
		books.clear();
		System.out.println(books);
	}
	/**
	 * @Title: clone
	 * @Description: ������HashSet��ǳ������û�и���Ԫ�ر����
	 * 				 ������ɺ�add��remove�����໥û��Ӱ�죻
	 * 				���Ƕ�Set�еĶ�������ͻ�Ӱ�죬����ǳ���������������
	 * @return: void
	 */
	public static void cloneHashSet(){
		
		HashSet<Stu> clone =  (HashSet<Stu>) ((HashSet<Stu>) books).clone();
		System.out.println("clone before:"+clone);
		
		Stu t = new Stu();
		t.setAge(2);
		t.setName("rtyuiop");
		clone.add(t);
		System.out.println("clone add after:"+clone);
		System.out.println("books after:"+books);
		
		Iterator<Stu> iterator = books.iterator();
		while(iterator.hasNext()){
			Stu next = iterator.next();
			next.setAge(5);
		}
		
		Iterator<Stu> iterator2 = clone.iterator();
		while(iterator2.hasNext()){
			Stu next = iterator2.next();
			System.out.println(next.getAge());
		}
	}
	
	
	/**
	 * @Title: containsTest
	 * @Description: �˷�������contains����,�ײ�����HashMap��containsKey����ʵ�ֵġ�
	 * 				���Ա�hashcode��Ȼ��ͨ��equals�Աȣ�
	 * @return: void
	 */
	public static void containsTest(){
		Stu t = new Stu();
		t.setAge(5);
		t.setName("rtyuiop");
		System.out.println(books.contains(t));
	}
	/**
	 * @Title: isEmptyTest
	 * @Description: ����Empty����,�ײ����HashMap��isEmpty����
	 * @return: void
	 */
	public static void isEmptyTest(){
		System.out.println(books.isEmpty());
	}
	/**
	 * @Title: removeTest
	 * @Description: �÷�������size()��remove()
	 * 				 remove()��ͨ��hashCode�ж��Ƿ�һ�µ�
	 * @return: void
	 */
	public static void removeTest(){
		Stu t = new Stu();
		t.setAge(5);
		t.setName("rtyuiop");
		books.add(t);
		System.out.println("before remove:"+books.size());
		books.remove(t);
		System.out.println("after remove:"+books.size());
		
	}
	public static void main(String[] args) {
		add();
//		clear();
		cloneHashSet();
		containsTest();
		isEmptyTest();
		removeTest();
	}

}

class Stu{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object paramObject) {
		if(this == paramObject)
			return true;
		else
			if(paramObject instanceof Stu ){
				Stu temp = (Stu) paramObject;
				if(temp.getAge() == this.getAge())
					return true;
				else
					return false;
			}else
				return false;
	}
	
	@Override
	public int hashCode() {
		return 1;
		//return super.hashCode();
	}
}
