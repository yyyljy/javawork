package api.util;

import java.util.HashSet;
import java.util.Set;
//Set의 주요기능인 합집합 교집합 기능을 구현해보기
public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");

		print(set,"set");
		
		//합집합을 구현하는 방법은 => Set객체를 생성할 때 합집합으로 표현할 Set을
		//생성자의 매개변수로 전달
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		print(set2,"set2");
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("hive");
		set3.add("java");
		set3.add("oracle");
		set3.add("jdbc");
		print(set3,"set3");
		
		//set과 set3의 교집합 구하기
		set.retainAll(set3);
		print(set, "교집합set");
	}
	//Set에 저장된 데이터를 꺼내서 출력하기
	public static void print(Set<String> set, String setName) {
		System.out.println("사이즈=>"+set.size());
		for (String data : set) {
			System.out.println("set에 저장된 요소=>"+data);
		}
		System.out.println("=======================");
	}
}
