package Ex2_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		String[][] actor = { { "[song]", "����", "����", "����" }, { "[lee]", "��λ�", "�����ڵ�", "����" },
				{ "[ryo]", "�Õ���", "��Ű", "Ÿ¥" } };

		// �˻��� ��� : song
		// [song]
		// ����
		// ����
		// ����
		// ------------�˻��� �ùٸ��� �ƽ��ϴ�

		// �˻��ҹ�� : park
		// �ش���� �����ϴ�

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ��� �̸� : ");
		String name = sc.next();

		int count = 0;

		for (int i = 0; i < actor.length; i++) {

			if (actor[i][0].equalsIgnoreCase("[" + name + "]")) {

				for (int j = 0; j < actor[i].length; j++) {

					System.out.println(actor[i][j]);

				} // inner

			} else {

				count++;

				if (count == actor.length) {

					System.out.println("�ش� ����� �̷��� ��ϵǾ����� �ʽ��ϴ�");
					
				}
			}

		} // outer

	}// main
}
