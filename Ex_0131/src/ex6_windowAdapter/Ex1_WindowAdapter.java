package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_WindowAdapter {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 600, 400, 2450);

		// X버튼 클릭 감지를 위한 Adapter클래스
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);// 열려있는 모든 프레임을 종료

			}

		});

		f.setVisible(true);
		//-------------------------------
		Frame f2 = new Frame("두번째");
		f2.setBounds(500, 600, 400, 2450);

		 
		f2.setVisible(true);

	}// main
}
