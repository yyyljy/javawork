package api.util;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(79);
		list.add(55);
		list.add(100);
		list.add(98);
		list.add(99);
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i);
		}
		double avg = (double)sum/list.size();
		System.out.println("����:"+sum);
		System.out.println("���:"+avg);
	}

}
