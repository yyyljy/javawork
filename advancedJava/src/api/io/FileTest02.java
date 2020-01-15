package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

//������ ���θ� Ž��
public class FileTest02 {
	public static void main(String[] args) {
		//c:/iot/iotest������ ���� ���� �� ���������
		//[�������]
		//a	---------[����]
		//b	---------[����]
		//ArrayTest01.java -------[����:���ϻ�����]
		//.
		//.
		//.
		//���������� ������ ��¥�� �� �� ���� �������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String path = "c:/iot/iotest/";
		File file1 = new File(path);
		String[] list = file1.list();
		for (int i = 0; i < list.length; i++) {
			File file = new File(path+list[i]);
			if(file.isFile()) {
				System.out.print(file.getName());
				System.out.println("---------------[����("+file.length()+")]:"+sdf.format(file.lastModified()));
			}else {
				System.out.print(file.getName());
				System.out.println("---------------[����]");
			}
		}
		
				
	}
}
