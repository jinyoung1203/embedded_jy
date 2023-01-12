package Ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력

		// 입력 : faegetq2tgfg;/
		// a의 갯수 : 1

		Scanner sc = new Scanner(System.in);

		int count = 0;

		System.out.print("입력 : ");
		String str = sc.next();

		// 입력받은 문자열의 길이만큼 for문 반복
		for (int i = 0; i < str.length(); i++) {

			// a를 찾아낼떄마다 카운트 증가
			if (str.charAt(i) == 'a') {
				count++;
			}
		} // for

		System.out.println("a의 갯수 : " + count);

	}// main
}
