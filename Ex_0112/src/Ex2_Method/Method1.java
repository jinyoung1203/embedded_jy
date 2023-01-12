package Ex2_Method;

public class Method1 {
	
	//메서드의 구성 및 정리
	
	public void test1() {
		System.out.println("안녕하세요!");
		
	}
	public int test2(int n) {
		//반환형이 void가 아닐경우 마지막에 반드시
		//return 값이 포함되어있어야 한다
		
		n += 100;
		System.out.println("n : " +n);
		
		//return값은 반드시 	반환형 타입으로 맞춰준다
		return n;
		
	}
	
	public String test3(String s, int n) {
		String str = "저는" + s + "이고," +n +"세 입니다";
		return str;
	}
	
	
}





