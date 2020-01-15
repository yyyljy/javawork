package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		FileWriter fw = new FileWriter("src/data/copy_result.txt");
		try {
			fr = new FileReader("src/api/io/FileTest01.java");
			while(true) {
				int data = fr.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
				fw.write(data);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
				if(fw!=null)fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
