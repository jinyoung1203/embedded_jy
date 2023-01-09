package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {

		// 2중 for문을 사용하여 아래의 결과를 출력하시오
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			} // inner

			System.out.println();
		} // outer

		System.out.println("----------------------");

		//         *
		//       * * *
		//     * * * * *
		//   * * * * * * *
		// * * * * * * * * *
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 + i; j++) {

				if (i + j > 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			} // inner

			System.out.println();

		} // outer

		System.out.println("------------------------");

		for (int i = 3; i >= 0; i--) {

			for (int j = 0; j < 5 + i; j++) {

				if (i + j > 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();

		} // outer

	}// main
}
