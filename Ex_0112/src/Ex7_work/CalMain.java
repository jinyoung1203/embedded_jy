package Ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		//��1,��2,�����ڸ� Calculater�� getResult()�޼���� �����Ͽ�
		//����� ����Ͻÿ�
		
		//��1 : 5
		//��2 : 10
		//������ : +
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.println("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.println("������ : ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		cal.getResult(op, su1, su2);
		
	}//main
}




























