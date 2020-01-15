package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//advancedJava프로젝트폴더 아래 저장된 test.txt의 내용을 읽어서 콘솔에 출력하기
public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("src/data/test.txt");
			while(true) {
				int data = fis.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
