package api.util;

import java.util.HashMap;
import java.util.Set;

//HashMap�� ����
public class HashMapTest {
	public static void main(String[] args) {
		//1. key�� value�� �� ������ ����
		//	-Generic���� ������ Ÿ���� ����� ���� key�� ���� Ÿ��,
		//	value�� ���� Ÿ���� ���� �����ؾ� �Ѵ�.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//map������ key�� ��Ҹ� �����ϱ� ������ key�� ������ �����.
		map.put(1, "servlet");
		map.put(1, "jsp");
		map.put(1, "spring");
		System.out.println("map�� ����� ��� ����:"+map.size());
		System.out.println(map.get(1));
		
		//map�� ����� �����͸� ��� ����ϱ�
		//map�� key�� �̿��ؼ� ����� ��ġ�� ����ϱ� ������ ����� ������� ��µ��� �ʴ´�.
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "servlet");
		map2.put("2", "jsp");
		map2.put("3", "spring");
		map2.put("4", "tiles");
		map2.put("5", "mybatis");
		
		//1. key����� �����Ѵ�.
		Set<String> keylist = map2.keySet();
		//2. �ݺ��� �ȿ��� key�� �̿��� value�� �����Ѵ�.
		for (String key : keylist) {
			String value = map2.get(key);
			System.out.println("key:"+key+" value:"+value);
		}
	}
}
