package Ex1_string;

import java.util.Scanner;

public class Ex1_Stirng {
	public static void main(String[] args) {

		// String은 두가지를 가지고 있다
		// 1)객체를 생성하는 방법이 두가지다(암시적 , 명시적)☆
		// 2)한번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		//String만 객체형 변수
		//new없이 생성가능
		//같은 객체를 생성해도 주소값 공유 가능
		
		// s1은 객체
		// int a 의 a는 변수
		// 대문자 시작은 객체
		
		String s1 = "abc";//암시적 객체
		String s2 = "abc";
		
		String s3 = new String("abc"); //명시적 객체생성
		String s4 = new String("abc");
		
		//==은 기본자료형 끼리 비교하는 경우 값을 비교
		//객체간의 ==는 주소값 비교
		if (s1 == s3) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
		//String클래스는 객체간 주소비교보다, 값을 비교하는 겨우가 훨씬 많다
		
		//s1.equals(s3)사용시 값 비교
		//거의 equals 사용
		if (s1.equals(s3)) {
			
			System.out.println("값이 같습니다");
			
		} 
		
		System.out.println("-------------");
		
		//Scanner sc = new Scanner(System.in);
		//s3 = sc.next();
		
		//if (s1 == s3) {
			//System.out.println("같습니다");
		//}else {
		//	System.out.println("다릅니다");
		//}
		
		//System.out.println("-----------");
		
		//if (s1.equals(s3)) {
		//System.out.println("같습니다");
		//}
		
		String greet = "안녕";
		greet +=  "하세요";
		
		System.out.println(greet);
		
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}// main
}



































