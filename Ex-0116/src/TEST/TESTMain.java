package TEST;

import java.util.Scanner;

public class TESTMain {

//		����ڰ� ���� ������ �ִ� ���� �Է¹ް�, ũ����, �����, �ݶ� �ܵ��� �ϳ��� ������ ��
//		�� �����ϴ� ����� ���� ��� ����ϱ�. ��, ������� �ʴ� ��ǰ�� ������ �ȵȴ�. ũ���� 500��, ����� 700��, �ݶ� 400��. ��� :
//		����� ������ �ݾ� : 4000
//		ũ���� : 1��, ����� : 1����, �ݶ� : 7ĵ
//		ũ���� : 2��, ����� : 2����, �ݶ� : 4ĵ
//		ũ���� : 3��, ����� : 3����, �ݶ� : 1ĵ
//		ũ���� : 5��, ����� : 1����, �ݶ� : 2ĵ

	public static void main(String[] args) {

		int cream = 500;
		int shrimp = 700;
		int coke = 400;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ� : ");
		money = sc.nextInt();

		for (int i = 0; money - i * cream>0; i++) {
			for (int j = 0; money - j * shrimp>0; j++) {
				for (int k = 0; money - k * coke>0; k++) {
					if (money == i * cream + j * shrimp + k * coke) {
						System.out.println("ũ���� : " + i + " ��, ����� : " + j + "����, �ݶ� : " + k + "ĵ");

					}
				}

			}
		}
	}// main

}
