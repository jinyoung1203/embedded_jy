package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_WindowAdapter {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 600, 400, 2450);

		// X��ư Ŭ�� ������ ���� AdapterŬ����
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);// �����ִ� ��� �������� ����

			}

		});

		f.setVisible(true);
		//-------------------------------
		Frame f2 = new Frame("�ι�°");
		f2.setBounds(500, 600, 400, 2450);

		 
		f2.setVisible(true);

	}// main
}
