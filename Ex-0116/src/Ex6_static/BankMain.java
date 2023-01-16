package Ex6_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("신촌점","02-111-1111");
		Bank b2 = new Bank("이대점","02-222-2222");
		Bank b3 = new Bank("홍대점","02-333-3333");
		
		
		//static으로 지정된 변수나 메서드는
		//클래스명.static변수 형태로 바로 접근가능
		Bank.interest = 0.1f;
		
		b1.getResult();
		b2.getResult();
		b3.getResult();
	}//main
}
