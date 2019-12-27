package exam.jdbc;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	public void insertMenu(){
		//입사일 : 오늘 날짜, point : 1000
		System.out.println("*******고객등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("포인트:");
		int point = key.nextInt();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		CustomerDTO user = new CustomerDTO(id,pass,name,point,addr);
		int result = dao.insert(user);
		if(result > 0) {
			System.out.println("고객 등록 완료");
		}else {
			System.out.println("고객 등록 실패");
		}
	}
	public void updateMenu(){
		System.out.println("*******고객수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		CustomerDTO user = new CustomerDTO(id,addr);
		int result = dao.update(id, addr);
		if(result > 0) {
			System.out.println("주소 정보 변경 완료");
		}else {
			System.out.println("주소 정보 변경 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******고객삭제********");
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		CustomerDTO user = new CustomerDTO(id);
		int result = dao.delete(id);
		if(result > 0) {
			System.out.println("고객 삭제 완료");
		}else {
			System.out.println("고객 삭제 실패");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
	}
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
	}
}


















