package Ex2_overload;

public class Bread {
	//�޼���1
	public void makeBread() {
		System.out.println("���� ��������ϴ�");
	}
	//�޼���2
	public void makeBread(int count) {
		
		for (int i = 0; i < count; i++) {
			System.out.println("���� ��������ϴ�");
		}
		System.out.printf("%d���� ���� ��������\n",count);
		
	}
	//�޼���3
	public void makeBread(String name, int count) {
		
		for (int i = 0; i < count; i++) {
			
			System.out.printf("%s�� ��������ϴ�\n",name);
			
		}
		System.out.printf("%d����%s(��)�� ��������ϴ�",count,name);
	}
	
}











