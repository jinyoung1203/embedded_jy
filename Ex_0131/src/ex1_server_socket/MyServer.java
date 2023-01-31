package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {

		try {
			// ������ ������ Ŭ���̾�Ʈ���� ���� ��Ʈ�� ����д�
			ss = new ServerSocket(3000);
			System.out.println("���� �غ� �Ϸ�!");

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}// MyServer

	@Override
	public void run() {

		while (true) {

			try {

				// ������ Ŭ���̾�Ʈ ������ ������ accept()�޼���� �޾Ƽ�
				// s��ü���� �Ѱ��ش�
				//accept() : �����ڰ� �ö����� �Ʒ��ʶ����� �������� �ʰ� ����Ѵ�
				Socket s = ss.accept();
				
				//�������� ip�� �����ͺ���
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ������ ȯ���մϴ�");
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		} // while
	}

}// MyServer














