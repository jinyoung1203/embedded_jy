package Ex4_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {

		// 1~50������ ���� ������Ų��
		// ����Ŭ�������� ������ �Է¹޴´�
		// �Է¹��� ���� UP,DOWN,�������� �Ǵ�
		// �����ϰ�� mainŬ������ while�� ������������ ó��

		// ���� : 30
		// DOWN
		// ���� : 15
		// UP
		// ���� : 25
		// 3ȸ ���� ����!!

		// ����Ŭ������ �ϴ� ����¥��

		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();

		while (true) {
			// up, down �� ����ó��
			// ������ ��� while�� ����������
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			int n = sc.nextInt();
			boolean res = ud.checkResult(n);

			if (res) {// res == true boolean ! > res != true
				// ������ ������
				break;// while���� ����������
			}

		} // while

	}// main
}
