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
		this.board_id = id;
		this.writer = writer;
		this.title = title;
		this.subject = subject;
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
		System.out.println("순     번 : " + board_id);
		System.out.println("작 성 자 : " + writer);
		System.out.println("작성일자 : " + wdate);
		System.out.println("제     목 : " + title);
		System.out.println("내     용 : " + subject);
		System.out.println("조 회 수 : " + hit);
		return null;
	}

}
