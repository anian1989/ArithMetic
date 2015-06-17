package MapStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMapStudy {
	static HashMap<String, Stu> hashMap = new HashMap<String, Stu>();
	static HashMap<String, Stu> hashMapClone = new HashMap<String, Stu>();

	/**
	 * @Title: clear
	 * @Description: TODO
	 * @return: void
	 */
	public static void clear() {
		Stu s = new Stu();
		s.setAge(10);
		s.setName("1");
		hashMap.put("1", s);
		hashMap.put("2", s);
		System.out.println("clear before��" + hashMap.size());
		hashMap.clear();
		System.out.println("clear after��" + hashMap.size());

	}

	/**
	 * @Title: cloneHashMap
	 * @Description: ���ش� HashMap ʵ����ǳ�������������Ƽ���ֵ����(ͨ�������hashCode��֪)
	 * @return: void
	 */
	public static void cloneHashMap() {
		Stu s = new Stu();
		s.setAge(10);
		s.setName("1");
		hashMap.put("1", s);
		hashMap.put("2", s);

		hashMapClone = (HashMap<String, Stu>) hashMap.clone();
		System.out.println("hashMapClone get(\"1\") :" + hashMapClone.get("1"));
		System.out.println("hashMap get(\"1\") :" + hashMap.get("1"));
	}

	/**
	 * @Title: compute
	 * @Description: compute jdk 8 �� ����map���͵�ǰmapֵ�����µ�mapֵ(��֪������ô���ɶ)
	 * @return: void
	 */
	public static void compute() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("Csharp", 5);
		Integer value = map.compute("Java",
				new BiFunction<String, Integer, Integer>() {
					public Integer apply(String t, Integer u) {
						System.out.println("t : " + t + ", u : " + u);
						return 2;
					}
				});
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("key : " + entry.getKey() + ", value : "
					+ entry.getValue());
	}

	/**
	 * @Title: computeIfAbsent
	 * @Description: ���map�в�����map����map����Ӧ��ֵΪnull������mapֵ
	 *               �����������null����map�м���ü�ֵ�ԣ����򲻼���
	 * @return: void
	 */
	public static void computeIfAbsent() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 9);
		map.put("C", 10);
		Integer value = map.computeIfAbsent("C++",
				new Function<String, Integer>() {
					public Integer apply(String t) {
						System.out.println("t : " + t);
						return 3;
					}
				});
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("key :" + entry.getKey() + ",vlaue:"
					+ entry.getValue());
	}

	/**
	 * @Title: computeIfPresent
	 * @Description: ���map�д���map���Ҷ�Ӧmapֵ��Ϊnull�����ݵ�ǰmap��ֵ�Լ����µ�mapֵ
	 *               �����������null����map���Ƴ��ü�ֵ��
	 * @return: void
	 */
	public static void computeIfPresent() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("C", 5);
		Integer value = map.computeIfPresent("Java",
				new BiFunction<String, Integer, Integer>() {
					public Integer apply(String t, Integer u) {
						System.out.println("t :" + t + ",u:" + u);
						return 2;
					}
				});
		System.out.println("computeIfPresent:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey() + ",value:"
					+ entry.getValue());
		}
	}

	/**
	 * @Title: contains
	 * @Description: ����containsKey��containsValue
	 * @return: void
	 */
	public static void contains() {
		Stu s = new Stu();
		s.setAge(10);
		s.setName("1");
		hashMap.put("3", s);
		System.out.println(hashMap.containsKey("1"));
		System.out.println(hashMap.containsValue(s));

	}

	/**
	 * @Title: forEach
	 * @Description: ��map��ÿ����ֵ��ִ��ָ���Ĳ�����ֱ�����еļ�ֵ�Զ������� �˷���ֻ�ܶ������ܱ�map�еļ�ֵ��Ϣ
	 * @return: void
	 */
	public static void forEach() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("C", 5);
		System.out.println("forEach:");
		map.forEach(new BiConsumer<String, Integer>() {
			public void accept(String t, Integer u) {
				u = 10;
			}
		});
		map.forEach(new BiConsumer<String, Integer>() {
			public void accept(String t, Integer u) {
				System.out.println("t:" + t + ",u:" + u);
			}
		});
	}

	/**
	 * @Title: getOrDefault
	 * @Description: ����map����Ӧ��mapֵ�����������map��������Ĭ��ֵ
	 * @return: void
	 */
	public static void getOrDefault() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("C", 5);
		System.out.println(map.getOrDefault("P", 10));

	}

	/**
	 * @Title: isEmpty
	 * @Description: HashMap��isEmptyֻ�Ƕ�map����У�飬������У��
	 * @return: void
	 */
	public static void isEmpty() {
		HashMap<String, Integer> map2 = null;
		System.out.println(map2.isEmpty());
	}

	// keySet�����������Ĳ���
	/**
	 * @Title: merge
	 * @Description: ���map�в�����map����map����Ӧ��mapֵΪnull������value������Ϊnull��map�м����
	 *               ��ֵ�ԣ����������������ֵ��Ϊ�գ�����mapֵΪ����ֵ���������ֵΪnull����map���Ƴ�map��
	 * @return: void
	 */
	public static void merge() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("Csharp", 5);
		Integer value = map.merge("J", 7,
				new BiFunction<Integer, Integer, Integer>() {
					public Integer apply(Integer t, Integer u) {
						System.out.println("t : " + t + ", u : " + u);
						return 10;
					}
				});
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("key : " + entry.getKey() + ", value : "
					+ entry.getValue());
	}

	/**
	 * @Title: putIfAbsent
	 * @Description: ���map�в�����map����map����Ӧ��mapֵΪnull���������map����mapֵ
	 * @return: void
	 */
	public static void putIfAbsent() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("Csharp", 5);
		Integer value = map.putIfAbsent("Java", 10);
		Integer value2 = map.putIfAbsent("Python", 3);
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("key : " + entry.getKey() + ", value : "
					+ entry.getValue());
	}

	/**
	 * @Title: replaceAndreplaceAll
	 * @Description: replace �滻map����Ӧ��mapֵ replaceAll
	 *               �滻map�е�ÿ��map����Ӧ��mapֵΪ���������ķ���ֵ
	 * @return: void
	 */
	public static void replaceAndreplaceAll() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 8);
		map.put("Csharp", 5);
		map.replaceAll(new BiFunction<String, Integer, Integer>() {
			public Integer apply(String t, Integer u) {
				System.out.println("t : " + t + ", u : " + u);
				if (t.equals("Java"))
					return 2;
				else
					return 10;
			}
		});
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("key : " + entry.getKey() + ", value : "
					+ entry.getValue());
	}

	public static void main(String[] args) {
		clear();
		cloneHashMap();
		contains();
		compute();
		computeIfAbsent();
		computeIfPresent();
		forEach();
		getOrDefault();
		// isEmpty();
		merge();
		putIfAbsent();
		replaceAndreplaceAll();
	}

}

class Stu {
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
		if (this == paramObject)
			return true;
		else if (paramObject instanceof Stu) {
			Stu temp = (Stu) paramObject;
			if (temp.getAge() == this.getAge())
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		// return 1;
		return super.hashCode();
	}
}
