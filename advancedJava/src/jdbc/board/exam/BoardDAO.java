package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardDTO board);//�Խñ� ���(C)
	int insert(String id, String title, String content);//�Խñ� ���
	int update(String id, int boardnum);//�Խñ� ����(U)
	int delete(int boardnum);//�Խñ� ����(D)
	ArrayList<BoardDTO> select();//��ü �Խñ� ��ȸ(L)
	ArrayList<BoardDTO> findByTitle(String title);//�Խñ� �˻�
	BoardDTO read(int boardnum);//�Խñ� ��ȸ(R)
}
