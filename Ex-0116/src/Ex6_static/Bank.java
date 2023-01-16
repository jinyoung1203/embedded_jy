package Ex6_static;

public class Bank {
	private String point;
	private String tel;
	
	//객체가 아무리 많이 생성되어도 *static변수는 메모리에 딱 한개만* 만들어진다
	static float interest;
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
		interest = 10f;
		
		
		
	}
	
	public void getResult() {
		System.out.println("지점 : " +point);
		System.out.println("전화 : " +tel);
		System.out.println("이자율 : " +interest + "%");
		System.out.println("--------------");
		
	}
	
	
	
	
	
	
	
}
