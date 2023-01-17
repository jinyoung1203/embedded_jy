package Ex5_Super;

public class Child extends Parent {

	
	
	public Child() {
		//super : 부모클래스
		super(10);//부모의 생성자 호출
		super.name = "홍길동";//부모클래스의 변수로 접근
		System.out.println("Child의 생성자" + name);
	}
	
	@Override
	public void getMsg() {
		System.out.println("자식클래스의 메서드");
		
		//parent의getMsg()메서드를 가져다 쓰시오;
		//super.getMsg();
	}
	
	
	
}
