package chap07.oop.poly;
/*[ContentŬ����]
1. ����   title(String), price(int)   
2. ������   �⺻������    title �� �Ű������� �޴� ������  
3. �޼ҵ�   
    - void totalPrice()��� abstract�޼ҵ�  
    - setter/getter �޼ҵ� : title, price ����  
    - show()      
      =>��title ������ ������ price �� �Դϴ�.����� ����ϴ� �޼ҵ�      
          ��) �̳������� ������ 2000�� �Դϴ�.  
*/
public abstract class Content {
	private String title;
	private int price;
	public Content() {
	}
	public Content(String title) {
		super();
		this.title = title;
	}
	public abstract void totalPrice();
	
	public void show() {
		System.out.println(title+" ������ ������ "+price+"�� �Դϴ�.");
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
