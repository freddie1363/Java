package net.gondr.tetris;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import net.gondr.domain.Block;
import net.gondr.domain.Player;

public class Game {
	private GraphicsContext gc;
	public Block[][] board;

	private double width;
	private double height;

	private AnimationTimer mainLoop; // 메인루프
	private long before; // 이전시간 기록변수

	private Player player;
	private double blockDownTime = 0;

	private int score = 0;

	public Game(Canvas canvas) {
		// 캔버스의 너비와 높이를 가져온다.
		width = canvas.getWidth();
		height = canvas.getHeight();

		double size = (width - 4) / 10;

		board = new Block[20][10]; // 게임 판 만들고

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				board[i][j] = new Block(j * size + 2, i * size + 2, size);
			}
		}

		this.gc = canvas.getGraphicsContext2D();

		mainLoop = new AnimationTimer() {
			@Override
			public void handle(long now) { // now는 나노초 단위로 들어옴.
				update((now - before) / 1000000000d);
				before = now;
				render();
			}
		};

		before = System.nanoTime();

		// 플레이어 모양 설정
		player = new Player(board);
		mainLoop.start();

	}

	// 업데이트 매서드
	public void update(double delta) {
		// 매 프레임마다 실행되는 update매서드 블럭의 자동하강 로직을 담당.
	}

	public void checkLineStatus() {
		// 라인이 꽉 찼는지 체크해주는 매서드
	}

	// 렌더 메서드
	public void render() {
		// 스테이지 그리기
		gc.clearRect(0, 0, width, height); // 전부 지우고 새로 그리기
		gc.setStroke(Color.rgb(0, 0, 0)); // 검은색으로 외곽선 그리고
		gc.setLineWidth(2);
		gc.strokeRect(0, 0, width, height);

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				board[i][j].render(gc);
			}
		}
	}

	public void keyHandler(KeyEvent e) {
		player.keyHandler(e); // 키보드 핸들링을 담당하는 매서드
	}

}
