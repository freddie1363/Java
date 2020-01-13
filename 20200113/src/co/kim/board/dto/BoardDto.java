package co.kim.board.dto;

import java.sql.Date;

public class BoardDto {
	private int board_id;
	private String writer;
	private Date wdate;
	private String title;
	private String subject;
	private int hit;
	
	public BoardDto() {
		
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	public String toString() {
		System.out.print(board_id + " : ");
		System.out.print(writer + " : ");
		System.out.print(wdate + " : ");
		System.out.print(title + " : ");
		System.out.print(subject + " : ");
		System.out.println(hit + " : ");
		return null;
	}
	
	

}
