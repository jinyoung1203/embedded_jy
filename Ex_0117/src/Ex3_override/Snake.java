package Ex3_override;

public class Snake extends Animal{
	String sensor = "�㿡�� �ߺ�";
	
	//�޼����� �������̵�
	//'�޼����� ������'�� �ǹ̸� ������ ��Ӱ����� ��ü����
	//�θ��� �޼��带 ������ �ڽ��ǻ����� �°� ���븸 ������ �Ҽ��ֵ���
	
	@Override
	public int getLeg() {
		return 0;
	}
	
}
