package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		//키보드에서 n1과 n2변수에 각각 정수값을 입력받는다
		//n1부터 n2까지의 합을 출력.
		//큰 값을 먼저 입력받아도 결과는 같아야 한다!!
		
		//수1 : 1
		//수2 : 5
		//결과 : 15
		
		//수1 : 5
		//수2 : 1
		//결과 : 15
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = scan.nextInt();
		
		System.out.print("수2 : ");
		int n2 = scan.nextInt();
		
		int result = 0;
		
		//변수간의 값 교환
		if( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for( int i = n1; i <= n2; i++ ) {
			result += i;
		}	
		
		System.out.println("결과 : " + result);
		
		
	}//main
}












