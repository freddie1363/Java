package net.gondr.views;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;

public class MainController {
	@FXML
	private Canvas gameCanvas;
	
	@FXML
	public void initialize() {
		System.out.println("메인 레이아웃 초기화");
		
	}
}