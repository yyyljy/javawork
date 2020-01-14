package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css", "java"};
		ArrayList<String> arrayList = changeData(arr);
		int size = arrayList.size();
		for(int i=0;i<size;i++) {
			System.out.println(arrayList.get(i));
		}
		for(String data : arr) {
			System.out.println(data);
		}
	}
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> arlist = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			arlist.add(arr[i]);
		}
		return arlist;
	}
}
