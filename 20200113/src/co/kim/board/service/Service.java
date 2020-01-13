package co.kim.board.service;

import java.util.List;

import co.kim.board.dto.BoardDto;

public interface Service {
	
	
	default void defaultTest() {
		System.out.println("이것은 디폴트 지시자 메소드 테스트임.");
	}
	
	public List<BoardDto> allSelect();
	public BoardDto select(BoardDto dto);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(BoardDto dto);
	
	
	
	
	

}
