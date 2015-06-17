package CollectionStudy.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * @ClassName: HashSetStudy
 * @Description: HashSet学习，在学习之前建议先学习一下HashMap因为底层实现是用HashMap
 * 				 它的继承类和子类一会儿研究
 * @author: zhangjunshuai
 * @date: 2015年6月10日 下午6:51:29
 */
public class HashSetStudy {
	/**
	 * HashSet的特点：
			（1）HashSet不是同步的，多个线程访问是需要通过代码保证同步 
			（2）集合元素值可以使null。
	 */
	/**
	 * @Title: add
	 * @Description: HashSet不能添加重复的对象，底层是Map实现的有时间的研究；
	 * 				 自定义的对象如果想通过HashSet去重则需要重写HashCode方法和equals方法；
	 * 				HashSet在比较时先对比hashCode，在hashCode相同的情况下对比equals
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
	 * @Description: 清空，其底层是调用map的清空
	 * @return: void
	 */
	public static void clear(){
		books.clear();
		System.out.println(books);
	}
	/**
	 * @Title: clone
	 * @Description: 拷贝，HashSet是浅拷贝是没有复制元素本身的
	 * 				 拷贝完成后，add和remove操作相互没有影响；
	 * 				但是对Set中的对象操作就会影响，这是浅拷贝和深拷贝的区别
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
	 * @Description: 此方法测试contains方法,底层是用HashMap的containsKey方法实现的。
	 * 				（对比hashcode，然后通过equals对比）
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
	 * @Description: 测试Empty方法,底层调用HashMap的isEmpty方法
	 * @return: void
	 */
	public static void isEmptyTest(){
		System.out.println(books.isEmpty());
	}
	/**
	 * @Title: removeTest
	 * @Description: 该方法测试size()和remove()
	 * 				 remove()是通过hashCode判断是否一致的
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
