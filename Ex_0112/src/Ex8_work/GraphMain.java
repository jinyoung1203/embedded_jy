package Ex8_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {

		// 0~9사이의 난수를 100개 만들어서 저장

		// 18408723940895
		// ?의 갯수가 몇개인지 그래프화 시킨다
		// 0의갯수 : ######6
		// 1의갯수 : #########9
		// ....
		// 9의 갯수 : ####4

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
