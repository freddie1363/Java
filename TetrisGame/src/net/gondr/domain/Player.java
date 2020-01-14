package net.gondr.domain;

import java.util.Random;

import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import net.gondr.tetris.App;

public class Player {
	private Point2D[][][] shape = new Point2D[7][][]; //총 7개의 테트리스 블럭이 존재함.
	private int current = 0; //현재 모양
	private int rotate = 0; //현재 회전상태
	private int nowColor = 0;
	private Color[] colorSet = new Color[7]; //총 7개 색깔
	
	private Random rnd;
	
	private int x = 5;
	private int y = 2;
	
	private Block[][] board;
	
	public Player(Block[][] board) {
		this.board = board;
		//작대기
		//네모
		//ㄴ 모양
		// 역 ㄴ 모양		
		// _┌━ 모양
		// ─┐_ 모양
		// ㅗ 모양
		//색상 넣기
		colorSet[0] = Color.ALICEBLUE;
		colorSet[1] = Color.AQUAMARINE;
		colorSet[2] = Color.BEIGE;
		colorSet[3] = Color.BLUEVIOLET;
		colorSet[4] = Color.CORAL;
		colorSet[5] = Color.CRIMSON;
		colorSet[6] = Color.DODGERBLUE;
		
		rnd = new Random();
		current = rnd.nextInt(shape.length);
		nowColor = rnd.nextInt(colorSet.length);
		
		draw(false);
	}
	
	private void draw(boolean remove) {
		//블럭을 판에서 표시해주거나 없애주는 매서드
	}
	
	public Point2D[] getPointArray(String pointStr) {
	// 0,-1:0,0:0,1:0,2 형식으로 데이터가 들어오면 해당 데이터를 Point 객체 배열로 변경해주는 매서드
		Point2D[] arr = new Point2D[4];
		String[] pointList = pointStr.split(":");
		for(int i = 0; i < pointList.length; i++) {
			String[] point = pointList[i].split(","); //컴마를 기준으로 나누고 
			double x = Double.parseDouble(point[0]);
			double y = Double.parseDouble(point[1]); //x,y좌표를 숫자로 변경해서
			arr[i] = new Point2D(x, y);
		}
		return arr;
	}
	
	public void keyHandler(KeyEvent e) {
		//키보드 입력을 처리하는 매서드
	}
	
	private void move(int dx, int dy, boolean rot) {
		//블럭을 이동시키는 매서드
	}
	
	public boolean down() {
		//블럭을 한칸 아래로 내리는 매서드
		return false;
	}
	
	private void getNextBlock() {
		//다음블럭 가져와서 초기화
		current = rnd.nextInt(shape.length);
		nowColor = rnd.nextInt(colorSet.length);
		x = 5;
		y = 2;
		rotate = 0;
	}
	
	private boolean checkPossible() {
		//블럭의 이동이 가능한지 체크하는 매서드
		return true;		
	}
}