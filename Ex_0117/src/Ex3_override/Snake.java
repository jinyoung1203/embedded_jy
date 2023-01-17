package Ex3_override;

public class Snake extends Animal{
	String sensor = "밤에도 잘봄";
	
	//메서드의 오버라이드
	//'메서드의 재정의'의 의미를 가지며 상속관계의 객체에서
	//부모의 메서드를 가져와 자식의사정에 맞게 내용만 재정의 할수있도록
	
	@Override
	public int getLeg() {
		return 0;
	}
	
}
