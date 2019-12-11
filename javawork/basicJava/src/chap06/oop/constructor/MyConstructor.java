package chap06.oop.constructor;
//������ ����
public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	public MyConstructor() {
		System.out.println("�⺻������");
	}
	
	//�α��ο�
	public MyConstructor(String name, String id, String pass) {
		System.out.println("�Ű����� 3�� ������");
		//�������(�ν��Ͻ�����, ��ü����)�� �ʱ�ȭ
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	//������
	public MyConstructor(String name, String id, String pass, String nickname) {
		this(name,id,pass); //������ �ۼ��� ���� �Ű����� 3���� �����ڸ� ȣ��
		System.out.println("�Ű����� 4�� ������");
		this.nickname = nickname;
	}
	//��ȸ��
	public MyConstructor(String name, String id, String pass, String nickname, String addr) {
		this(name,id,pass,nickname);
		System.out.println("�Ű����� 5�� ������");
		this.addr = addr;
	}
	//���Կ�
	public MyConstructor(String name, String id, String pass, String nickname, String addr, int point) {
		this(name,id,pass,nickname,addr);
		System.out.println("�Ű����� 6�� ������");
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
