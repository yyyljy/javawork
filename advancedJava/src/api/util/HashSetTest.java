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
		System.out.println("������=>"+set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println("���� ���:"+data);
		}
		
		for (String data : set) {
			System.out.println("set�� ����� ���:"+data);
		}
	}
}
