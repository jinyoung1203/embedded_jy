package Ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// ȸ���� �Ǵ��ϱ�
		// ȸ������ �������о �ڿ��� �о �Ȱ��� ������ ����
		// 12321, 123321

		// ���� �Է��ϼ��� : 12321
		// 12321�� ȸ���� �Դϴ�

		// �� : 12345
		// 12345�� ȸ������ �ƴմϴ�

		Scanner sc = new Scanner(System.in);
		System.out.println("�� : ");
		String ori = sc.next();// ������
		String rev = "";

		// ���� ���ڿ�ori�� ����� rev������ ����
		for (int i = ori.length() - 1; i >= 0; i--) {

			rev += ori.charAt(i);

		} // for

		if (!ori.equals(rev)) {
			System.out.println(ori + "��(��) ȸ������ �ƴ�");
		} else {
			System.out.println(ori + "��(��) ȸ�����̴�");
		}

	}// main
}
