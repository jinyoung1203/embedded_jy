package ex2_multi_chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{

	ServerSocket ss;
	
	//복사된 클라이언트들을 닫아줄ArrayList
	ArrayList<CopyClient> list;
	
	public ChatServer() {
		
		try {
			list = new ArrayList<CopyClient>();
			
			ss = new ServerSocket(3500);
			System.out.println("서버시작");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//생성자
	
	@Override
	public void run() {
		while(true) {
			
			try {
				
				Socket s = ss.accept();//클라이언트를 기다린다
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}//while
	}//run
	
	
	//메세지 전달 메서드
	public void sendMessage( String msg ) {
		//접속자들은 CopyClient구조로 ArrayList에 저장되어있는 상태
		for (CopyClient cc : list) {
			cc.out.println( msg );//서버에 접속해있는 모든 접속자들에게 메세지를 전달
		}
		
	}//sendMessage
	
	//종료된 사용자를 ArrayList에서 제거
	
	public void removeClient( CopyClient cc ) {
		
		list.remove(cc);//접속 종료된 사용자를 ArrayList에서 제거
		
		//남아있는 구성원들에게 퇴장 메세지를 전달
		sendMessage("***" + cc.ip + "님이 퇴장하였습니다***");
		
	}
	
}










