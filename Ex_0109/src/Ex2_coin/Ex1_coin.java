package Ex2_coin;

import java.util.Random;
import java.util.Scanner;

public class Ex1_coin {
	public static void main(String[] args) {
		// ���� money�� 10~5000������ ������ ����� �ִ´�
		// ��, 1�� �ڸ� ���ڴ� �ݵ�� 0���� ����� ������ �Ѵ�
		// �߻��� ���� money�� �������� �ٲ�����.
		// 500, 100, 50, 10��¥�� ������ ���� � �Ž��������� �Ǵ��ϴ� �ڵ屸��
		// ��, ������ ���� ���ڷ� �Ž��� �ٰ�

		// �ݾ� : 2590
		// 500 : 5
		// 50 : 1
		// 10 : 4

		Scanner sc = new Scanner(System.in);

		int[] coin = { 500, 100, 50, 10 };

		Random rnd = new Random();

		int money = rnd.nextInt(500) + 1;
		money *= 10;

		System.out.println("�ݾ� : " + money);

		for (int i = 0; i < coin.length; i++) {

			int res = money / coin[i];

			if (res > 0) {

				System.out.printf("%d�� : %d\n", coin[i], res);
				money %= coin[i];
			} // if

		} // for
	}// main
}
