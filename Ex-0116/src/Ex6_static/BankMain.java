package Ex6_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("������","02-111-1111");
		Bank b2 = new Bank("�̴���","02-222-2222");
		Bank b3 = new Bank("ȫ����","02-333-3333");
		
		
		//static���� ������ ������ �޼����
		//Ŭ������.static���� ���·� �ٷ� ���ٰ���
		Bank.interest = 0.1f;
		
		b1.getResult();
		b2.getResult();
		b3.getResult();
	}//main
}
