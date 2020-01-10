package co.kim.board.dto;

import java.util.Date;

public class BoardDto {
	private int board_id;
	private String writer;
	private Date wdate;
	private String title;
	private String subject;
	private int hit;
	
	public BoardDto() {
		
	}
	
	public BoardDto(int id, String writer, String title, String subject) {
		this.board_id =id;
		this.writer = writer;
		this.title = title;
		this.subject = subject;
	}

}
