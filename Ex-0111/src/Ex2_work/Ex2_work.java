package Ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 회문수 판단하기
		// 회문수란 앞으로읽어도 뒤에서 읽어도 똑같이 읽히는 숫자
		// 12321, 123321

		// 값을 입력하세요 : 12321
		// 12321은 회문수 입니다

		// 값 : 12345
		// 12345는 회문수가 아닙니다

		Scanner sc = new Scanner(System.in);
		System.out.println("값 : ");
		String ori = sc.next();// 원본값
		String rev = "";

		// 원본 문자열ori를 뒤집어서 rev변수에 저장
		for (int i = ori.length() - 1; i >= 0; i--) {

			rev += ori.charAt(i);

		} // for

		if (!ori.equals(rev)) {
			System.out.println(ori + "은(는) 회문수가 아님");
		} else {
			System.out.println(ori + "은(는) 회문수이다");
		}

	}// main
}
