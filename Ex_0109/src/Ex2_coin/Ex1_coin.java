package Ex2_coin;

import java.util.Random;
import java.util.Scanner;

public class Ex1_coin {
	public static void main(String[] args) {
		// 변수 money에 10~5000까지의 난수를 만들어 넣는다
		// 단, 1의 자리 숫자는 반드시 0으로 만들어 지도록 한다
		// 발생된 난수 money를 동전으로 바꿨을때.
		// 500, 100, 50, 10원짜리 동전이 각각 몇개 거슬러지는지 판단하는 코드구현
		// 단, 가능한 적은 숫자로 거슬러 줄것

		// 금액 : 2590
		// 500 : 5
		// 50 : 1
		// 10 : 4

		Scanner sc = new Scanner(System.in);

		int[] coin = { 500, 100, 50, 10 };

		Random rnd = new Random();

		int money = rnd.nextInt(500) + 1;
		money *= 10;

		System.out.println("금액 : " + money);

		for (int i = 0; i < coin.length; i++) {

			int res = money / coin[i];

			if (res > 0) {

				System.out.printf("%d원 : %d\n", coin[i], res);
				money %= coin[i];
			} // if

		} // for
	}// main
}
