package chap07.oop;
/*[Dessert Ŭ����]
- productName(��ǰ��), price(�ݾ�), count(����)�� ��� ������ ���ǵǾ� �־�� �Ѵ�.
- �⺻ ������, �Ű����� �ʱ�ȭ�� ����ϴ� �����ڸ� �����մϴ�.
getTotalPrice		�ݾ��� ����ϴ� �޼ҵ�
					�ܰ�*�ݾ�
print				������ ����ϴ� �޼ҵ�
printProductInfo	��ǰ�� ������ ����ϴ� �޼ҵ�
*/
public class Dessert {
	private String productName;
	private int price;
	private int count;
	public Dessert() {
	}
	public Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		return price*count;
	}
	public static void print() {
		System.out.println("=================================");
		System.out.println("�ֹ��׸�\t����\t����");
		System.out.println("=================================");
	}
	public void printProductInfo() {
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount());
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
