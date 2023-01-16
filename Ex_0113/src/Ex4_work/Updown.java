package Ex4_work;

import java.util.Random;

public class Updown {

	// Random rnd = new Random();
	// int random = rnd.nextInt(50) + 1;

	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean isEnd = false;

	// Up, Down 판단
	public boolean checkResult(int n) {
		count++;

		if (n < random) {
			System.out.println("UP!");
		} else if (n > random) {
			System.out.println("DOWN!");
		} else {
			System.out.println(count + "회만에 정답!");
			isEnd = true;
		}

		return isEnd;

	}

}
