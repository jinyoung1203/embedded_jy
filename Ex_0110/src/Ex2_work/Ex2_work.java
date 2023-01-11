package Ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값 만큼의 행과 열을 가지는 홀수마방진만들기
		// 위 오른쪽
		// 겹치면 바로아래

		// 사이즈 : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02

		Scanner sc = new Scanner(System.in);

		int[][] arr;
		int num = 1;// 시작수
		int y = 0;// 행(y)
		int x = 0;// 열(x)

		System.out.print("사이즈 : ");
		int size = sc.nextInt();

		x = size / 2;

		// 배열의 크기 지정
		arr = new int[size][size];

		// 마방진을 그릴 while문
		while (num <= size * size) {

			arr[y][x] = num;
			// 3일 경우 처음값
			// 0행 1행 = 1

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

		// arr배열에 담긴 모든값을 화면에 출력
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				System.out.printf("%02d ", arr[i][j]);
				// 나오는 값이 두자리 숫자여서 02d이다

			} // inner

			System.out.println();

		} // outer

	}// main
}
