package Ex2_overload;

public class BreadMain {
	public static void main(String[] args) {	
	
		Bread bread = new Bread();
		
		//makeBread() 1�� ȣ���
		//���� ��������ϴ�
		bread.makeBread();
		System.out.println("-----------");
		
		//makeBread() 2�� ȣ���
		//���� ��������ϴ�
		//���� ��������ϴ�
		//2���� ���� ��������
		bread.makeBread(2);
		System.out.println("----------");
		
		//makeBread() 3�� ȣ���
		//ũ������ ��������ϴ�
		//ũ������ ��������ϴ�
		//ũ������ ��������ϴ�
		//3���� ũ������ ��������
		bread.makeBread("ũ����",3);
		
		
	}//main
}










