package Ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ Ȧ�������������
		// �� ������
		// ��ġ�� �ٷξƷ�

		// ������ : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02

		Scanner sc = new Scanner(System.in);

		int[][] arr;
		int num = 1;// ���ۼ�
		int y = 0;// ��(y)
		int x = 0;// ��(x)

		System.out.print("������ : ");
		int size = sc.nextInt();

		x = size / 2;

		// �迭�� ũ�� ����
		arr = new int[size][size];

		// �������� �׸� while��
		while (num <= size * size) {

			arr[y][x] = num;
			// 3�� ��� ó����
			// 0�� 1�� = 1

			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}

			if (y < 0) {
				y = size - 1;
			}

			if (x >= size) {
				x = 0;
			}

			num++;
		} // while

		// arr�迭�� ��� ��簪�� ȭ�鿡 ���
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				System.out.printf("%02d ", arr[i][j]);
				// ������ ���� ���ڸ� ���ڿ��� 02d�̴�

			} // inner

			System.out.println();

		} // outer

	}// main
}
