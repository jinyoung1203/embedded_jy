package ex1_server_socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		
		//Ŭ���̾�Ʈ�� �ǹ��ϴ� Socket��ü�� �����ѵ�
		//������ ������ ip�ּҿ� ��Ʈ��ȣ�� ���� ������ �����Ѵ�
		try {
			
			Socket s = new Socket("192.168.3.16",3000);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}//main
}
