package Ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		// Ű���忡�� �ݾ��� �Է¹ް�
		// �ش���� �ȿ��� ���Ǽ� �ִ� ������ ��ϸ� ȭ�鿡 ���
		// ���Ḧ �����ϸ� ���� �� �ܾ��� ��ȯ

		// �ϴ� ���ο� �����

		// insert coin : 1000
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke (��)�� �����ϼ̽��ϴ�
		// �ܾ� : 100

		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		ven.canInit();

		System.out.println("insert coin : ");
		int money = sc.nextInt();

		ven.showCans(money);// ���Ǽ� �ִ� ������� ���

		System.out.println(">> ");
		String select = sc.next();// ����� �̸� �Է�

		// ���������� �ܵ���ȯ
		ven.outCan(select);

	}// main
}
