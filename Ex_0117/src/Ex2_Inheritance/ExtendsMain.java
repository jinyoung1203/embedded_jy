package Ex2_Inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		//상송관계에서의 자식 클래스는 부오가 가진 자원(속성이나 메서드)을
		//마음대로 가져다가 사용할수있다
		
		Child c1 = new Child();
		System.out.println(c1.money);
		//부모자식관게의 클래스라고 해도  private으로 지정된 변수를
		//자식은 가져다 쓰지 못한다
		//System.out.println(c1.str);
		System.out.println(c1.car);
		
		
		Parent p1 = new Parent();
		//상속관게라고 할지라도 부오클래스는 자식이 가지고있는 속성을 사용하지 못한다
		//p1.car X
		

		if (c1 instanceof Parent ) {
			System.out.println("c1은 Parent와 인스턴스가 같습니다");
		}
		
		
	}//main
}















