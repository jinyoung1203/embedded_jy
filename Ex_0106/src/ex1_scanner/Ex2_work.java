package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		//Ű���忡�� n1�� n2������ ���� �������� �Է¹޴´�
		//n1���� n2������ ���� ���.
		//ū ���� ���� �Է¹޾Ƶ� ����� ���ƾ� �Ѵ�!!
		
		//��1 : 1
		//��2 : 5
		//��� : 15
		
		//��1 : 5
		//��2 : 1
		//��� : 15
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��1 : ");
		int n1 = scan.nextInt();
		
		System.out.print("��2 : ");
		int n2 = scan.nextInt();
		
		int result = 0;
		
		//�������� �� ��ȯ
		if( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for( int i = n1; i <= n2; i++ ) {
			result += i;
		}	
		
		System.out.println("��� : " + result);
		
		
	}//main
}












