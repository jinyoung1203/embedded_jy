package Ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���

		// �Է� : faegetq2tgfg;/
		// a�� ���� : 1

		Scanner sc = new Scanner(System.in);

		int count = 0;

		System.out.print("�Է� : ");
		String str = sc.next();

		// �Է¹��� ���ڿ��� ���̸�ŭ for�� �ݺ�
		for (int i = 0; i < str.length(); i++) {

			// a�� ã�Ƴ������� ī��Ʈ ����
			if (str.charAt(i) == 'a') {
				count++;
			}
		} // for

		System.out.println("a�� ���� : " + count);

	}// main
}
