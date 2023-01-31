package ex3_ui_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		Frame frame = new Frame("나의 첫 프레임");
		frame.setSize(400, 300);//생성될 프레임의 너비와 높이
		frame.setLocation(500, 200);//생성될 프레임의 좌표값
		
		frame.setBackground( Color.cyan );//배경색 변경
		
		frame.setVisible(true);//화면에 프레임 띄우기
		
		
		
		
	}//main
}
