package Ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		//수1,수2,연산자를 Calculater의 getResult()메서드로 전달하여
		//결과를 출력하시오
		
		//수1 : 5
		//수2 : 10
		//연산자 : +
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.println("연산자 : ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		cal.getResult(op, su1, su2);
		
	}//main
}




























