package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		//1) 4월은 30일까지 있습니다.
		//2) 15월은 없습니다
		int month = 14;
		
		switch( month ) {
		
		//31까지 있는 달
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		
		//30까지 있는 달
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
			
		case 2:
			System.out.println("2월은 28일까지 있습니다");
			break;
			
		default:
			System.out.println(month + "월은 없어요");
			break;
		}//switch
		
	}//main
}















































