package api.util;

import java.util.HashSet;

public class HashSetEaxm {
	public static void main(String[] args) {
		//set1 -> 1���� 10������ ����
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1;i<11;i++) {
			set1.add(i);
		}
		//set2 -> 5���� 15������ ����
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i=5;i<16;i++) {
			set2.add(i);
		}
		//set1�� set2������ ����ϱ�
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		for (Integer data : set2) {
			set3.add(data);
		}
		for (Integer data : set3) {
			System.out.println("������=>"+data);
		}
		System.out.println("=-==--==--==-=-");
		//set1�� set2������ ����ϱ�
		set1.retainAll(set2);
		for (Integer data : set1) {
			System.out.println("������=>"+data);
		}
	}
}
