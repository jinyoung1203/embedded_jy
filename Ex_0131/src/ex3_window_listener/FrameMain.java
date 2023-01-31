package ex3_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		//f.setSize(100,400);
		//f.setLocation(300, 300);
		f.setBounds(300, 300, 500, 400);//사이즈 및 좌표값 포함메서드
		
		//프레임에게 우상단 버튼 클릭을 감지하는 이벤트 감지자를 부착
		f.addWindowListener( new MyListener() );
		
		
		f.setVisible(true);
		
		
		
		
	}//main
}
