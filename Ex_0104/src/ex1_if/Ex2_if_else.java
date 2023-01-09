package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if-else문
		//if( 조건식 ){
		//	조건식이 참일 때 실행되는 영역
		//}else{
		//	조건식이 거짓일 때 실행되는 영역
		//}
		
		int n = 50;
		String str = "";
		
		if( n++ >= 50 ) {
			str = "n은 50이상의 수";
		}else {
			str = "n은 50미만의 수";
		}
		
		System.out.println(str);
		
		System.out.println("-----------------------------");
		
		char ch = '남';
		
		if( ch == '여' ) {
			str = "당신은 여자입니다";
		}else {
			str = "당신은 남자입니다";
		}
		
		System.out.println(str);
		
		System.out.println("------------------------------");
		
		//바로 위의 코드를 삼항연산자로 수정하시오
		ch = '남';
		//조건식 ? 조건참 : 조건거짓;
		String res = ch == '여' ? "여자입니다" : "남자입니다";
		System.out.println(res);
		
	}//main
}





























































