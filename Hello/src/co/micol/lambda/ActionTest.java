package co.micol.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTest extends JFrame {
	JButton btn ;
	public ActionTest() {
		this.setTitle("frame test");
		this.setSize(300, 200);
		int var = 10;
		// 버튼 추가
		btn = new JButton("눌러줘!!");
		btn.addActionListener((e) -> {
			System.out.println("버튼 클릭");
			this.setTitle("dddd");        //람다식 안에서 this는 람다식을 실행하는 outer 클래스를 가리킴
			this.btn.setText("클릭됨...");  //필드도 접근가능
			System.out.println(var); //지역변수도 접근가능
		
		
		}); // 람다식으로 표현
		this.getContentPane().add(btn);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new ActionTest();

	}
	
	/*
	 * class ActionHandler implements ActionListener{
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * System.out.println("버튼 클릭");
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

}
