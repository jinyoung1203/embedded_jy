package ex5_interface;

public class Kitchen implements AllMenu{
//public class Kitchen implements Menu1, Menu2, Menu3 {
	//인터페이스는 구현능력이 없기 때문에
	//하나의 클래스에서 다중으로 상속(구현)이 가능
	
	@Override
	public String jjajang() {
		return "중면 + 춘장소스";
	}

	@Override
	public String jjambbong() {
		return "고추기름 + 각종 해물";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "돼지고기 + 당근 + 양파...";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "이천쌀 + 달걀등등...";
	}

	@Override
	public String mando() {
		// TODO Auto-generated method stub
		return "밀가루 + 고기 다진거";
	}

	@Override
	public String rajogi() {
		// TODO Auto-generated method stub
		return "여러가지 재료 섞었어요";
	}

}









