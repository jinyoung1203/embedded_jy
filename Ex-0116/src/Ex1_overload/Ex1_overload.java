package Ex1_overload;

public class Ex1_overload {
	//�޼��� �����ε�
	//�����ε��� �޼����� "�ߺ� ����"��� �ϸ� �ϳ��� Ŭ���� ���ο���
	//���� �̸��� ���� �޼��尡 ������ ���ǵǴ� ���� ���Ѵ�
	
	//*�����ε� ��Ģ*
	//1)�޼��� ������ ������ �޶���Ѵ�
	//2)������ ������ ���ٸ� *Ÿ��*�� �޶�� �Ѵ�
	//3)������ ���� Ÿ���� ������, ���� ������ �޶���Ѵ�
	public void result() {
		System.out.println("���ڰ� ���� �޼ҵ�!");
		
	}
	
	public void result(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result(char c) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼ҵ�");
	}
	 
	public void result(String s) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result(String s, int n) {
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	}
	
	public void result(int n, String s) {
		System.out.println("����, ��������� ���ڸ� �޴� �޼���");
	}
	
	
}








