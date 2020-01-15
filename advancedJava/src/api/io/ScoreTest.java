package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		String[] dataArr = null;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			int sum = 0;
			double avg = 0;
			
			while(true) {
				String data = br.readLine();
				if(data==null) {
					break;
				}
				dataArr = data.split(",");
				for (int i = 0; i < dataArr.length; i++) {
					if(i%2==0) {
						System.out.print(dataArr[i]+"ÀÇ Á¡¼ö´Â ");
					}else {
						sum += Integer.parseInt(dataArr[i]);
						System.out.println(dataArr[i]+"Á¡");
					}
					
				}
			}
			System.out.println("ÃÑÁ¡:"+sum);
			avg = (double)sum/dataArr.length/2;
			System.out.println("Æò±Õ:"+avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
