package ex2_multi_chat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable {

	JTextArea area;
	JTextField input;
	JButton send_bt;

	// ���� ������ ���� ��ü
	Socket s;
	BufferedReader in = null;
	PrintWriter out = null;
	Thread t;

	public ChatClient() {

		setBounds(100, 100, 400, 500);
		setLayout(null);

		area = new JTextArea();
		area.setBounds(10, 20, 360, 360);

		input = new JTextField();
		input.setBounds(10, 395, 250, 50);

		send_bt = new JButton("����");
		send_bt.setBounds(270, 395, 100, 50);

		// TextField, Button, TextArea�� frame�� �߰�
		add(area);
		add(input);
		add(send_bt);

		// ���� Ŭ���̾�Ʈ�� ������ ����
		connected();

		// ���۹�ư Ŭ���� ������ �޽����� �����ϴ� ������
		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendData();// ������ �޽��� �����ϱ� �޼���
			}
		});

		t = new Thread(this);
		t.start();

		// ������ ������ ���� �Ұ�
		setResizable(false);

		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				// x��ư�� ������ �����ϱ� ���� �������� ������ ����
				out.println("xx:~X");
			};

		});

		setVisible(true);

	}// ������

	// �������� �޼���
	private void connected() {

		try {

			s = new Socket("192.168.3.101", 3500);

			// �������� �Ѿ�� ���� �о���̱� ���� input��Ʈ��
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// ���ڿ��� ������ �����ϱ� ���� ��Ʈ��
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}// connected()

	// ������ �����͸� �����ϴ� �޼���
	private void sendData() {
		String msg = input.getText();
		out.println(msg);
		input.setText("");
	}// sendData()

	@Override
	public void run() {

		// �����κ��� ���޵Ǵ� �޽����� ��ٸ���

		try {

			while (true) {

				String msg = in.readLine();

				if (msg.equals("xx:~X")) {
					break;
				}

				if (msg != null) {
					area.append(msg + "\n");
				}
			} // while

		} catch (Exception e) {

		} finally {

			try {
				out.close();
				in.close();
				s.close();
				System.exit(0);
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// run()

}