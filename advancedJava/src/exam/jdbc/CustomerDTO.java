package exam.jdbc;
import java.util.Date;
/*
ID
PASS
NAME
REGDATE
POINT
ADDR
*/
/*
 * public int insert(CustomerDTO customer) : CustomerDTO�� ���� insert�� �� �ֵ��� �����ϱ�
 * public int update(String id, String addr) : �Է¹��� id�� ��ġ�ϴ� �������� addr�����ϱ�
 * public int delete(String id) : �Է¹��� id�� ��ġ�ϴ� ������ �����ϱ�
*/
public class CustomerDTO {
	private String id;
	private String pass;
	private String name;
	private Date regdate;
	private int point;
	private String addr;
	public CustomerDTO() {
		super();
	}
	//insert
	public CustomerDTO(String id, String pass, String name, int point, String addr) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.point = point;
		this.addr = addr;
	}
	//update
	public CustomerDTO(String id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}
	//delete
	public CustomerDTO(String id) {
		super();
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
