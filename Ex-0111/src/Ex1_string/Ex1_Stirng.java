package Ex1_string;

import java.util.Scanner;

public class Ex1_Stirng {
	public static void main(String[] args) {

		// String�� �ΰ����� ������ �ִ�
		// 1)��ü�� �����ϴ� ����� �ΰ�����(�Ͻ��� , �����)��
		// 2)�ѹ� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
		//String�� ��ü�� ����
		//new���� ��������
		//���� ��ü�� �����ص� �ּҰ� ���� ����
		
		// s1�� ��ü
		// int a �� a�� ����
		// �빮�� ������ ��ü
		
		String s1 = "abc";//�Ͻ��� ��ü
		String s2 = "abc";
		
		String s3 = new String("abc"); //����� ��ü����
		String s4 = new String("abc");
		
		//==�� �⺻�ڷ��� ���� ���ϴ� ��� ���� ��
		//��ü���� ==�� �ּҰ� ��
		if (s1 == s3) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
		
		//StringŬ������ ��ü�� �ּҺ񱳺���, ���� ���ϴ� �ܿ찡 �ξ� ����
		
		//s1.equals(s3)���� �� ��
		//���� equals ���
		if (s1.equals(s3)) {
			
			System.out.println("���� �����ϴ�");
			
		} 
		
		System.out.println("-------------");
		
		//Scanner sc = new Scanner(System.in);
		//s3 = sc.next();
		
		//if (s1 == s3) {
			//System.out.println("�����ϴ�");
		//}else {
		//	System.out.println("�ٸ��ϴ�");
		//}
		
		//System.out.println("-----------");
		
		//if (s1.equals(s3)) {
		//System.out.println("�����ϴ�");
		//}
		
		String greet = "�ȳ�";
		greet +=  "�ϼ���";
		
		System.out.println(greet);
		
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}// main
}



































