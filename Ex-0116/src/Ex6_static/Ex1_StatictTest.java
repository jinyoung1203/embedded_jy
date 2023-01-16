package Ex6_static;

import java.lang.Thread.State;

public class Ex1_StatictTest {
	
	String str1 = "일반멤버변수";
	static String str2 = "스테틱 변수";
	
	public void test1() {
		//일반 메서드에서는 static변수와 일반변수 모두 사용가능
		str1 = "hi";
		str2 = "hello";
		//일반 메서드에서는 static키워드를 가진 변수를 만들수없다
		//static String str3 = "반갑";
		
		
	}
	
	public static void test2() {
		//static메서드에서는 일반 멤버변수 사용불가
		//str1 = "hi";
		str2 = "hello";
		
		int num = 100;//지역변수로 일반 변수를 사용하는것은 가능
		
		//static메서드에서는 static변수를 지역변수로 생성불가
		//static int num2 = 300;
	}
	
	
	
}





