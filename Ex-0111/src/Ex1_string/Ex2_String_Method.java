package Ex1_string;

import java.util.Scanner;

public class Ex2_String_Method {
	public static void main(String[] args) {
	
		//String클래스에 메서드(기능)들
		//어떤 작업을 수행하기 위한 명령문들의 집합체
		//반복적으로 사용되는 코드를 줄이기위해 쓰는 개념
		
		Scanner sc = new Scanner(System.in);
		
		String name = "Hong Gil Dong";
		
		//length만 1부터 시작
		int len = name.length();
		System.out.println("문장의 길이 : " +len);
		
		int index = name.indexOf('o');
		System.out.println("맨 첫번쨰 o의 위치 : "+ index);
		
		index = name.lastIndexOf('o');
		System.out.println("맨 뒤의 o의 위치: "+ index);
		
		char c = name.charAt(5);
		System.out.println("추출한 문자 : " + c);
		
		String s1 = name.substring(5);
		System.out.println("5번쨰 위치부터 모든 문장 잘라내시오 : " +s1);
		
		//10전인 9까지 출력 end-1출력
		s1 = name.substring(5, 10);
		System.out.println("5~9번째 까지의 문장을 잘라내시오 : " +s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replace(".을 /로 치환 :" , "/");
		System.out.println(".을 /로 치환 : " +s1);
		
		name = name.replace("on", "ii");
		System.out.println("on을ii로 치환 : " +name);
		
		name = name.replaceAll("ii", "oo");
		System.out.println("ii을on로 치환 : " +name);
		
		name = "Kim. Lee. park.";
		String name2 = "Kim. Lee. park.";
		
		name = name.replace('.', '/');
		System.out.println("replace : " + name);
		
		//.앞의 문장을 포함한다
		//ii같은 문자는 문자만 치환시킨다
		name2 = name2.replaceAll(".", "/");
		System.out.println("replaceAll : " +name2);
		
		String id = " hi hello ";
		id = id.trim();//문장 앞뒤의 의미없는 공백을 제거
		System.out.println("trim사용한후 길이 : " +id.length());
		
		//특정 문장을 배열단위로 나눠서 저장해주는 메서드
		String[] id2 = id.split(" ");
		System.out.println(id2[0] + "/" + id2[1]);
		
		//대소문자를 구분하여 만들어야한다
		//equalsIgnoreCase는 단어만 같다면 신경쓰지 않는다
		String answer = "apple";
		
		if (answer.equalsIgnoreCase("apple")) {
			System.out.println("값이 같다");
		}else {
			System.out.println("값이 다르다");
		}
		
		//스트링 클래스의 메서드는 아니지만 앞으로 많이 사용하게될 메서드
		//정수형태의 문자열(String)을 연산이 가능한 실제 정수로 바꾸자
		String num = "10";
		int a = Integer.parseInt(num);
		System.out.println( a + 1 );
		
	}//main
}




























