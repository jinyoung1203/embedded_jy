package Ex5_Super;

public class Child extends Parent {

	
	
	public Child() {
		//super : �θ�Ŭ����
		super(10);//�θ��� ������ ȣ��
		super.name = "ȫ�浿";//�θ�Ŭ������ ������ ����
		System.out.println("Child�� ������" + name);
	}
	
	@Override
	public void getMsg() {
		System.out.println("�ڽ�Ŭ������ �޼���");
		
		//parent��getMsg()�޼��带 ������ ���ÿ�;
		//super.getMsg();
	}
	
	
	
}
