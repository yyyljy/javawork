package api.util;

import java.util.ArrayList;

public class ArrayListExam02 {
	public static void main(String[] args) {
/*	��ȣ	����		�ڹ�		��		android
 * 	1	�嵿��	97		100		88			=>	StudentDTO	
 * 	2	�̹�ȣ	100		92		91
 * 	3	���ؿ�	88		96		78
*/
		//ArrayList�� ������ �����ϱ�
		ArrayList<StudentDTO> stdlist = new ArrayList<StudentDTO>();
		StudentDTO std1 = new StudentDTO(1,"�嵿��",97,100,88);
		StudentDTO std2 = new StudentDTO(2,"�̹�ȣ",100,92,91);
		StudentDTO std3 = new StudentDTO(3,"�嵿��",97,100,88);
		
		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);
		
		display(stdlist);
	}
	
	//�Ű������� ���޹��� ArrayList�� ����� ������ ������ ����ϱ�
	public static void display(ArrayList<StudentDTO> stdlist) {
		int size = stdlist.size();
		for(int i=0;i<size;i++) {
			StudentDTO std = stdlist.get(i);
			System.out.println(std);
		}
	}
}
