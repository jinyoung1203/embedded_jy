package ex6_exception_work;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		
		//Ű���忡�� ������ �ް�
		//�������� ������ �ƴ����� �Ǵ��Ͻÿ�.
		
		//���� : 10
		//��� : 10
		
		//���� : aaa
		//aaa ��(��) ������ �ƴմϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
//		int num = 0;
		
//		try {
//			
//			num = sc.nextInt();
//			System.out.println("��� : " + num);
//			
//		} catch (Exception e) {
//
//			String str = sc.next();
//			System.out.println(str + "�� ������ �ƴ�");
//			
//		}
		
		String str = "";
		
		try {
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println("��� : " + num);
			
		}catch(Exception e) {
			
			System.out.println( str + "��(��) ������ �ƴմϴ�" );
			
		}
		
		
	}//main
}
























