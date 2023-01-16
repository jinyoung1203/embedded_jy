package Ex4_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {

		// 1~50사이의 난수 빌생시킨다
		// 메인클래스에서 정수값 입력받는다
		// 입력받은 값이 UP,DOWN,정답인지 판단
		// 정답일경우 main클래스의 while문 빠져나가도록 처리

		// 숫자 : 30
		// DOWN
		// 숫자 : 15
		// UP
		// 숫자 : 25
		// 3회 만에 정답!!

		// 메인클래스에 일단 로직짜기

		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();

		while (true) {
			// up, down 및 정답처리
			// 정답인 경우 while문 빠져나가기
			System.out.print("숫자를 입력하시오 : ");
			int n = sc.nextInt();
			boolean res = ud.checkResult(n);

			if (res) {// res == true boolean ! > res != true
				// 정답을 맞춘경우
				break;// while문을 빠져나간다
			}

		} // while

	}// main
}
