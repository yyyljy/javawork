package chap07.oop;
/*- Dessert Ŭ������ ��ӹ޴´�.
- Į�θ��� ��Ÿ���� ��� ������ �����մϴ�.(calorie)
- �⺻ �����ڿ� ���� �ʱ�ȭ�ϴ� �����ڸ� �����մϴ�.
*/

public class IceCream extends Dessert{
	private int calorie;
	public IceCream(){
	}
	/*public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}*/
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}//super constructor
	
	public static void print() {
		System.out.println("=====================================");
		System.out.println("�ֹ��׸�\t����\t����\tĮ�θ�");
		System.out.println("=====================================");
	}
	
	public void printProductInfo() {
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+calorie+"kcal");
	}
}
