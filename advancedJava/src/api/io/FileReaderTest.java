package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���ڴ����� test.txt�� ������ �о �ֿܼ� ����ϱ�
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
			System.out.println("����Ƚ��:"+count);
			System.out.println("����ð�:"+(end-start));
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
