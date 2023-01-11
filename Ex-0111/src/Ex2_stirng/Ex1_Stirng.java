package Ex2_stirng;

import java.util.Scanner;

public class Ex1_Stirng {
	public static void main(String[] args) {
		
		//주민번호룰 입력하세요
		//예)901122-2011345
		//>> 000918-3456789
		//당신은 00년 9월 18일에 태어난 남자입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 :" );
		System.out.println("에)901111-2222222");
		System.out.println(">> ");
		
		String id = sc.next();
		
		if (id.trim().length() < 14 || id.trim().charAt(6) != '-') {
			System.out.println("주민번호 형식이 올바르지 않습니다");
		}else {
			String y = id.substring(0,2);
			String m = id.substring(2,4);
			String d = id.substring(4,6);
			String gender = id.substring(7,8);
			
			if (gender.equals("1") || gender.equals("3") ) {
				gender = "남자";
			}else if (gender.equals("2") || gender.equals("4")) {
				gender = "여자";
			}
			
			System.out.printf("당신은%s년%s월%s일에 태어난 %s입니다",y, m, d, gender);
					
		}
		
		
	}//main
}















