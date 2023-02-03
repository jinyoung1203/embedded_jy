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
		//생성자를 통해 원본 클라이언트에 소켓 정보및 서버 정보를 받는다.
		this.s = s;
		this.server = cs;
		
		
		try {
			
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader( 
					new InputStreamReader( s.getInputStream() ) );
			
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			
		}
		
		
	}//생성자
	
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
