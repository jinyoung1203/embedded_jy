package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 키보드에서 정수값을 입력받고, 입력받은 숫자가 소수인지 판단하시오
		// 단, 키보드에서 1을 받았다면 '소수가 아님'을 출력해야 한다

		// 값 : 5
		// 5은(는) 소수 입니다

		// 값 : 6
		// 6은(는) 소수가 아닙니다

		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int n = sc.nextInt();

		int i = 0;

		for (i = 2; i <= n; i++) {

			if (n % i == 0) {
				break;
			} // if

		} // for

		if (i == n) {
			System.out.println(n + "(은)는 소수입니다!");
		} else {
			System.out.println(n + "(은)는 소수가 아닙니다!");
		}

	}// main
}
