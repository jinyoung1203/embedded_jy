package Ex2_overload;

public class BreadMain {
	public static void main(String[] args) {	
	
		Bread bread = new Bread();
		
		//makeBread() 1번 호출시
		//빵을 만들었습니다
		bread.makeBread();
		System.out.println("-----------");
		
		//makeBread() 2번 호출시
		//빵을 만들었습니다
		//빵을 만들었습니다
		//2개의 빵을 만들었어요
		bread.makeBread(2);
		System.out.println("----------");
		
		//makeBread() 3번 호출시
		//크림빵을 만들었습니다
		//크림빵을 만들었습니다
		//크림빵을 만들었습니다
		//3개의 크림빵을 만들었어요
		bread.makeBread("크림빵",3);
		
		
	}//main
}










