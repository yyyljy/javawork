package api.util;

import java.util.ArrayList;
//collection�� ������ ����� Ÿ���� generic���·� �����Ѵ�.
//collection Ŭ����
public class ArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ڹ�");
		list.add("������");
		list.add("JDBC");
		list.add("HTML5");
		list.add("CSS");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
