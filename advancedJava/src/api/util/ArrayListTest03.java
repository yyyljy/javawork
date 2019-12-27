package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css"};
		ArrayList<String> arrayList = changeData(arr);
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
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
