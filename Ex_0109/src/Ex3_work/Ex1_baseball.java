package Ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
	public static void main(String[] args) {
		
		/*
		 ������ ������ ���� �߱������� 
		 �迭�� ����Ͽ� �ڵ带 �ٿ����ÿ�
		 */
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] user = new int[3];//���Է� �迭
		int[] com = new int[3];//���� �迭
		do {
			
			for (int i = 0; i < com.length; i++) {
				com[i] = rnd.nextInt(9) + 1;
			}
			
		} while (com[0] == com[1]||com[1] == com[2]||com[2] == com[0]);
		
		//���� ������ �𸣴� ������ ���� ���ѹں� while�� �ۼ�
		while (true) {
			
			System.out.print("�Է�(��:123) : ");
			 
			int number = sc.nextInt();
			
			//����ڰ� �Է��� �� ������ ���� ��, ��, �� �� �ڸ��� ��� user�迭�� ����
			user[0] = number /100;//���� �ڸ�
			user[1] = number %100 / 10;//���� �ڸ�
			user[2] = number %100 % 10;//���� �ڸ�
			
			int strike = 0;
			int ball = 0;
			
			//����� ��
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < com.length; j++) {
					
					if(i == j) {
						if (com[i] == user[j]) {
							strike++;
						}
					}else {
						if (com[i] == user[j])
						ball++;
					}
					
				}//inner
			}//outer
			
			if (strike == 3) {
				System.out.println("����!");
				break;
			}else {
				//��Ʈ����ũ�� ���� �ϳ��� ���� ���
				if (strike > 0 || ball > 0) {
					System.out.printf("%d strike, %d ball \n", strike, ball);
				}else
					System.out.println("OUT!");
			}
			
			System.out.println("-----------------");
		}//while
		
		
	}//main
}
