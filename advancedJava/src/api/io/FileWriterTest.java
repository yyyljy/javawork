package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException{
		//File����� �Ű������� ���޵� ������ ������ �ش� ������ ���� �۾�������
		//���� ��� ���� ������ �����Ͽ� �۾��Ѵ�.
		//FileWriter fw = new FileWriter("src/data/output.txt");
		FileWriter fw = new FileWriter("src/data/output2.txt",true);
		fw.write(97);
		fw.write("english");
		fw.write("�ѱ�");
		fw.write("Ư\t��\t��\n��");
		fw.close();
	}
}
