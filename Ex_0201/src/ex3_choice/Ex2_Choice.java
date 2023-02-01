package ex3_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 300, 200);
		f.setLayout(null);

		Choice day = new Choice();
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");

		day.setBounds(10, 40, 100, 0);

		// day�� ������ �߰�
		day.addItemListener(new Ex2_ChoiceListener());

		// ������Ʈ�� �����ӿ� �߰�
		f.add(day);

		// ����-----------------------
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);// �����ִ� ��� �������� ����

			}

		});
		// -------------------
		f.setVisible(true);
	}// main
}
