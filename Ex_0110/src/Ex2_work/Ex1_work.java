package Ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� ����ŭ �Ǻ���ġ ���� ����ϱ�

		// �Է� : 8
		// 1 1 2 3 5 8 13 21

		Scanner sc = new Scanner(System.in);

		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		System.out.println("�Է� : ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {

			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;

			System.out.printf("%d ", num3);
			// ���� num2�� num3���������� num3�� num1�� �ǰ�num1�� �μ������Ѱ��̴�

		} // for

	}// main
}
