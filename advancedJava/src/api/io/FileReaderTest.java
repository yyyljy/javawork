package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//문자단위로 test.txt의 내용을 읽어서 콘솔에 출력하기
public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fs = null;
		try{
			fs = new FileReader("src/api/io/FileTest01.java");
			int count=0;
			long start = System.nanoTime();
			while(true) {
				int data = fs.read();
				if(data==-1) {
					break;
				}
				count++;
				System.out.print((char)data);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수:"+count);
			System.out.println("실행시간:"+(end-start));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(fs!=null) {
					fs.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
