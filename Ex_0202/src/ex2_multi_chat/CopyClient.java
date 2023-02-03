package ex2_multi_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
	
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;
	
	public CopyClient( Socket s, ChatServer cs ) {
		//�����ڸ� ���� ���� Ŭ���̾�Ʈ�� ���� ������ ���� ������ �޴´�.
		this.s = s;
		this.server = cs;
		
		
		try {
			
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader( 
					new InputStreamReader( s.getInputStream() ) );
			
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			
		}
		
		
	}//������
	
	@Override
	public void run() {
		
		try {
			
			while (true) {
				
				
				String msg = in.readLine();
				if (msg.equals("xx:~x")) {
					out.println("xx:~x");
					
					server.removeClient(this);
					
					break;
					
				}
				
				server.sendMessage(ip + " : " + msg);
				
				
			}//while
			
			
			
		} catch (Exception e) {
			
		}
		
	}//run
	
	
}//class end
