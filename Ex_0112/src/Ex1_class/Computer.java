package Ex1_class;

public class Computer {
	//클래스의 구성요소
	//1)변수, 속성, 멤버.....
	//2)메서드, 함수, 기능
	
	//컴퓨터를 만들기 위한 설계작업
	private String brand = "apple";
	int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
	//컴퓨터의 성능을 확인하기 위한 메서드
	//메서드 : 반복적으로 사용되는 코드를 줄이기 위해 만드는 하나의 영역
	public void getInfo() {
		System.out.println("브랜드 : " +brand);
		System.out.println("용량 : " +ssd);
		System.out.println("ram: " +ram);
		System.out.println("cpu : " +cpu);
		System.out.println("색상 : " +color);
		System.out.println("---------------------");
	}
	
	//메서드의 구성
	//접근제한자 반환형  메서드이름(파라미터, 매개변수, 인자)
	//public void getInfo() { 메서드 호출시 싱행영역 }
	
	//접근제한자
	//1)public : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	//2)private : 현재 클래스에서만 사용을 허가(보안성이 높음)
	//3)protected : 상속관계의 객체들에게만 사용을 허가
	//4)default : 현재 패키지 내의 객체들에게 사용을 허가
	
	
	
	
	
	
	
	
}
