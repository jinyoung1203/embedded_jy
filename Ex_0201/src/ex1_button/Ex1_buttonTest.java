package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_buttonTest {
	public static void main(String[] args) {
		Frame f = new Frame("��ư�׽�Ʈ!");
		// X Y �ʺ� ����
		f.setBounds(300, 300, 400, 400);

		// FrameŬ������ �߰��� ������Ʈ�� ȭ�鿡 ���� ä����� �Ӽ����������ִ�.
		f.setLayout(null);// �ڵ���ġ ����

		// ��ư����
		// �ڵ���ġ�� �����ִ� Frame�� ���Ե� �ڽ� ������Ʈ����
		// �ݵ�� ��ġ�� ũ�Ⱚ�� �����Ǿ��־�� �Ѵ�
		Button btnOk = new Button("Ȯ��!");
		btnOk.setBounds(70, 90, 100, 50);

		Button btnClose = new Button("�ݱ�!");
		btnClose.setBounds(230, 90, 100, 50);

		// ������ ��ư�鿡 ���ؼ� �̺�Ʈ ������ �߰�
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok��ư Ŭ�� �Ϸ�!");
			}
		});

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();// ����������
			}
		});

		// ������ ��ư�� f�� �߰�
		f.add(btnOk);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);// �����ִ� ��� �������� ����

			}

		});

		f.setVisible(true);

	}// main

}
