package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		//9가지 경우의 수
		//클래스추가후 직렬화
		//승패저장할 클래스
		
		
		//ObjectStream사용하여 문제 해결하기!!
		//결과------------
		
		//id : aaa
		//0승 0무 0패
		//가위(s) | 바위(r) | 보(p) : r
		//당신이 이겼습니다
		//1승 0무 0패
		//한판더? y | n : n
		
		
		//id : aaa
		//1승 0 무 0패
		//가위(s) | 바위(r) | 보(p) : s
		//비겼습니다
		//1승 1무 0패
		//한판더? y | n : n
		//게임종료
		
		Scanner sc = new Scanner(System.in);
		
		Rsp rsp = new Rsp();
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.println("id : ");
		String id = sc.next();
		rsp.setId(id);
		
		
		//게임 로드
		GameLoad gl = new GameLoad();
		rsp = gl.scoreLoder(id);
		if( rsp == null ) {
			rsp = new Rsp();
			rsp.setId(id);
		}else {
			win = rsp.getWin();
			lose = rsp.getLose();
			draw = rsp.getDraw();
					
		}
		
		
		System.out.printf("%d승%d무%d패\n" , win, draw, lose);
		
		while (true) {
			
			//컴퓨터가 랜덤으로 한가지 값을 생성
			//0:가위, 1:바위, 2:보
			int random = new Random().nextInt(3);
			
			System.out.println("가위(s) | 바위(r) | 보(p) : ");
			String user = sc.next();
			
			int userCnt = 0;
			
			if (user.equalsIgnoreCase("s")) {
				userCnt = 0;
			}else if ( user.equalsIgnoreCase("r") ) {
				userCnt = 1;
			}else if (  user.equalsIgnoreCase("p") ) {
				userCnt = 2;
			}
			
			//경우의 수 판별
			if (userCnt - random == -2 || userCnt - random == 1) {
				System.out.println("당신이 이겼습니다!");
				rsp.setWin(++win);
			}else if (userCnt - random == 0) {
				System.out.println("비겼습니다");
				rsp.setDraw(++draw);
			}else {
				System.out.println("당신이 졌습니다");
				rsp.setLose(++lose);
			}
			
			System.out.printf("%d승%d무%d패\n" , win, draw, lose);
			
			System.out.println("한판더? y | n :");
			String select = sc.next();
			
			if (!select.equalsIgnoreCase("y")) {
				System.out.println("게임종료!");
				break;
			}
			
		}//while
		
		//게임종료후 rsp객체를 저장
		GameSave gs = new GameSave();
		gs.scoreWriter(rsp);
		
		
		
	}//main
}



















