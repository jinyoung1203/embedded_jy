package Ex2_Inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		//��۰��迡���� �ڽ� Ŭ������ �ο��� ���� �ڿ�(�Ӽ��̳� �޼���)��
		//������� �����ٰ� ����Ҽ��ִ�
		
		Child c1 = new Child();
		System.out.println(c1.money);
		//�θ��ڽİ����� Ŭ������� �ص�  private���� ������ ������
		//�ڽ��� ������ ���� ���Ѵ�
		//System.out.println(c1.str);
		System.out.println(c1.car);
		
		
		Parent p1 = new Parent();
		//��Ӱ��Զ�� ������ �ο�Ŭ������ �ڽ��� �������ִ� �Ӽ��� ������� ���Ѵ�
		//p1.car X
		

		if (c1 instanceof Parent ) {
			System.out.println("c1�� Parent�� �ν��Ͻ��� �����ϴ�");
		}
		
		
	}//main
}















