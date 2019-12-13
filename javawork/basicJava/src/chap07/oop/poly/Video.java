package chap07.oop.poly;
/*
[VideoŬ����]
1. ����    genre(String)  
2. ������    title �� genre �� �Ű������� �޴� ������  
3. �޼ҵ�  
   - setter/getter �޼ҵ� : genre ����  
   - totalPrice()����  genre �� ���� ���� ������ ���� price ������ ������ �����ϼ���.  
     ��new���� ��� : 2000  
     ��comic���� ��� : 1500 
     ��child���� ��� : 1000  
     ������ : 500  
     ��Ʈ : ���ڿ��� ������ �������� ���Ϸ��� String Ŭ������ equals() �޼ҵ带  ���
             �� �� �ֽ��ϴ�.  
             ��)  ��java��.equals(��java��) : true ����       
                   ��java��.equals(��jsp��) : false ����
*/
public class Video extends Content{
	private String genre;
	public Video() {
	}
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	public void totalPrice() {
		if(genre.equals("new")) {
			setPrice(2000);
		}else if(genre.equals("comic")) {
			setPrice(1500);
		}else if(genre.equals("child")) {
			setPrice(1000);
		}else {
			setPrice(500);
		}
	}
}
