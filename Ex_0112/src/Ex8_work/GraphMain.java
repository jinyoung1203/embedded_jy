package Ex8_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {

		// 0~9������ ������ 100�� ���� ����

		// 18408723940895
		// ?�� ������ ����� �׷���ȭ ��Ų��
		// 0�ǰ��� : ######6
		// 1�ǰ��� : #########9
		// ....
		// 9�� ���� : ####4

		Random rnd = new Random();

		int[] nArr = new int[10];
		for (int i = 0; i < 100; i++) {
			int r = rnd.nextInt(10);
			System.out.print(r);

			nArr[r]++;

		} // for

		System.out.println();

		Graph g = new Graph();
		g.graph(nArr);

	}// main
}
