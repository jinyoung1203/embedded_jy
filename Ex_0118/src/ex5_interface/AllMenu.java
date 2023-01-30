package ex5_interface;

public interface AllMenu extends Menu1, Menu2, Menu3{
	//인터페이스들간에는 extends키워드를 통해 서로 상속이 가능
	//인터페이스들 끼리는 다중상속이 가능
	
	//Menu1을 상속받았다면 짜장, 짬뽕 추상메서드까지 AllMenu에서 사용할수 있게됨을 의미
	//jjajang()
	//jjambbong()
	
	String rajogi();
	
}
