package Ex6_gugudan;

import java.util.Scanner;

public class Ex2_GuguMain {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("�� : ");
		int dan = sc.nextInt();
		
		Ex1_Gugu gugu = new Ex1_Gugu();
		gugu.getGugudan( dan );
		
	}//main
}
