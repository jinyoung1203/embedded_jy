package Ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {

		// 2Ÿ�� �迭arr�� ��� ��� ���� �հ� ����� ���
		// ���� :201
		// ��� : 15.4615
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
		System.out.println("���� : " + total);
		avg = (float) total / count;
		System.out.printf("��� : %.2f", avg);

	}// main
}
