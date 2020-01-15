package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

//폴더의 내부를 탐색
public class FileTest02 {
	public static void main(String[] args) {
		//c:/iot/iotest폴더의 하위 폴더 및 파일을출력
		//[출력형태]
		//a	---------[폴더]
		//b	---------[폴더]
		//ArrayTest01.java -------[파일:파일사이즈]
		//.
		//.
		//.
		//마지막으로 접속한 날짜를 년 월 일의 형식으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String path = "c:/iot/iotest/";
		File file1 = new File(path);
		String[] list = file1.list();
		for (int i = 0; i < list.length; i++) {
			File file = new File(path+list[i]);
			if(file.isFile()) {
				System.out.print(file.getName());
				System.out.println("---------------[파일("+file.length()+")]:"+sdf.format(file.lastModified()));
			}else {
				System.out.print(file.getName());
				System.out.println("---------------[폴더]");
			}
		}
		
				
	}
}
