package ex9_break_continue;

public class Ex2_Break {
	public static void main(String[] args) {
		
		for( int i = 0; i < 3; i++ ) {
			
			switch (i) {
			case 0:
				System.out.println("0입니다");
				break;//switch내부의 break는 반복문이 아닌, switch문만 탈출
				
			case 1:
				System.out.println("1입니다");
				break;
			}//switch
			
		}//for
		
	}//main
}



