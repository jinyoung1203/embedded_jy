package ex2_input;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		//...Stream : byte����� ��Ʈ��
		//...Reader, ...Writer : char����� ��Ʈ��
		
		
		//Scanner sc = new Scanner(System.in);
		byte[] keyboard = new byte[100];
		
		System.out.println("�� : ");
		
		//Ű���� ���� �Է¹޾Ƽ� keyboard�迭�� ����
		try {
			System.in.read(keyboard);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = new String(keyboard);
		
		System.out.println(str.trim());

	}//main
}











