package co.kim.board.app;



import co.kim.board.dto.BoardDto;
import co.kim.board.serviceImpl.BoardServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		
		BoardServiceImpl board = new BoardServiceImpl();
		board.defaultTest(); // default 메소드 연습
		BoardDto dto = new BoardDto();
		dto.setBoard_id(1);
		dto = board.select(dto);
		dto.toString();
		

	}
	
	

}
