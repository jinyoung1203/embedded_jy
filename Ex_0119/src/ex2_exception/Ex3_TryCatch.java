package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		//��ĳ�ʸ� ���� Ű���忡�� ���� �Է¹ް�
		//�������� �ƴ����� �Ǵ��Ͻÿ�.
		
		//���� : 100
		//��� : 100
		
		//���� : a
		//������ �Է����ּ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		try {
			
			int n = sc.nextInt();
			System.out.println("��� : " + n);
			
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("������ �Է��ϼ���");
		}
				
		
	}//main
}













