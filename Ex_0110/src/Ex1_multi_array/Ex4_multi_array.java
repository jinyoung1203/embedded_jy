package Ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {

		// 2타원 배열arr에 담긴 모든 값과 합과 평균을 출력
		// 총합 :201
		// 평균 : 15.4615
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 12, 23, 34, 45 }, { 24, 35 } };

		int total = 0;
		float avg = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				total += arr[i][j];
				count++;

			} // inner

		} // outer
		System.out.println("총합 : " + total);
		avg = (float) total / count;
		System.out.printf("평균 : %.2f", avg);

	}// main
}
