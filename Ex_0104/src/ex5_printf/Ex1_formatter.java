package ex5_printf;

public class Ex1_formatter {
	public static void main(String[] args) {
		
		//포멧터 : 사용할 데이터의 결과를 원하는 구조로 출력 가능하게 해주는 문법
		
		//오늘은 23년 01월 05일 입니다
		int y = 23;
		int m = 1;
		int d = 15;
		System.out.println("오늘은 " + y + "년 " + m + "월 " + d + "일");
		System.out.printf("오늘은 %d년 %02d월 %02d일\n", y, m, d);
		
		//오늘의 날씨는 13.5도 입니다
		System.out.printf("오늘의 날씨는 %.1f도 입니다\n", 13.5f);
		
		//저는 A형 입니다
		char bt = 'A';
		System.out.printf("저는 %c형 입니다\n", bt);
		
		//제 이름은 홍길동 입니다
		System.out.printf("제 이름은 %s입니다\n", "홍길동");
		
		//오늘은 100%이해 했습니다
		System.out.printf("%d%% 이해함\n", 100);
		
		//1) %d : 정수
		//2) %f : 실수
		//3) %c : 문자
		//4) %s : 문자열
		//5) %% : %기호
	}//main
}

















































