package api.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		System.out.println("사이즈=>"+set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println("꺼낸 요소:"+data);
		}
		
		for (String data : set) {
			System.out.println("set에 저장된 요소:"+data);
		}
	}
}
