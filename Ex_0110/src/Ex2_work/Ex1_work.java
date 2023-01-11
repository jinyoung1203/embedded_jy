package Ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값만큼 피보나치 수열 출력하기

		// 입력 : 8
		// 1 1 2 3 5 8 13 21

		Scanner sc = new Scanner(System.in);

		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		System.out.println("입력 : ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {

			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;

			System.out.printf("%d ", num3);
			// 순서 num2ㅏ num3값을가지고 num3가 num1이 되고num1이 두수를더한값이다

		} // for

	}// main
}
