package Ex3_work;

import java.util.Random;

public class Ex3_lotto2 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int[] lotto = new int[6];

		outer: for (int i = 0; i < lotto.length;) {

			lotto[i] = rnd.nextInt(45) + 1;

			// 종복값체크 반복문
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;
				}

			} // inner

			System.out.printf("%d ", lotto[i]);
			i++;

		} // outer

	}// main
}
