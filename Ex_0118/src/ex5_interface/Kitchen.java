package ex5_interface;

public class Kitchen implements AllMenu{
//public class Kitchen implements Menu1, Menu2, Menu3 {
	//�������̽��� �����ɷ��� ���� ������
	//�ϳ��� Ŭ�������� �������� ���(����)�� ����
	
	@Override
	public String jjajang() {
		return "�߸� + ����ҽ�";
	}

	@Override
	public String jjambbong() {
		return "���߱⸧ + ���� �ع�";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "������� + ��� + ����...";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "��õ�� + �ް����...";
	}

	@Override
	public String mando() {
		// TODO Auto-generated method stub
		return "�а��� + ��� ������";
	}

	@Override
	public String rajogi() {
		// TODO Auto-generated method stub
		return "�������� ��� �������";
	}

}









