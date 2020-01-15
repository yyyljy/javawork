package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException{
		//File출력은 매개변수로 전달된 파일이 있으면 해당 파일을 열고 작업하지만
		//없는 경우 새로 파일을 생성하여 작업한다.
		//FileWriter fw = new FileWriter("src/data/output.txt");
		FileWriter fw = new FileWriter("src/data/output2.txt",true);
		fw.write(97);
		fw.write("english");
		fw.write("한글");
		fw.write("특\t수\t문\n자");
		fw.close();
	}
}
