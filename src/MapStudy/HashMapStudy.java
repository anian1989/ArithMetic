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
		System.out.println("clear before：" + hashMap.size());
		hashMap.clear();
		System.out.println("clear after：" + hashMap.size());

	}

	/**
	 * @Title: cloneHashMap
	 * @Description: 返回此 HashMap 实例的浅表副本：并不复制键和值本身(通过打出的hashCode可知)
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
	 * @Description: compute jdk 8 有 根据map键和当前map值计算新的map值(不知道这个用处是啥)
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
	 * @Description: 如果map中不存在map键或map键对应的值为null，计算map值
	 *               如果函数返回null，则map中加入该键值对，否则不加入
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
	 * @Description: 如果map中存在map键且对应map值不为null，根据当前map键值对计算新的map值
	 *               如果函数返回null，从map中移除该键值对
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
	 * @Description: 测试containsKey和containsValue
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
	 * @Description: 对map中每个键值对执行指定的操作，直到所有的键值对都被处理 此方法只能读数不能变map中的键值信息
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
	 * @Description: 返回map键对应的map值，如果不存在map键，返回默认值
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
	 * @Description: HashMap的isEmpty只是对map长度校验，不做空校验
	 * @return: void
	 */
	public static void isEmpty() {
		HashMap<String, Integer> map2 = null;
		System.out.println(map2.isEmpty());
	}

	// keySet不在做单独的测试
	/**
	 * @Title: merge
	 * @Description: 如果map中不存在map键或map键对应的map值为null，并且value参数不为null，map中加入该
	 *               键值对；否则如果函数返回值不为空，更改map值为返回值，如果返回值为null，从map中移除map键
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
	 * @Description: 如果map中不存在map键或map键对应的map值为null，则关联该map键和map值
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
	 * @Description: replace 替换map键对应的map值 replaceAll
	 *               替换map中的每个map键对应的map值为参数函数的返回值
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
