package Ex6_static;

import java.lang.Thread.State;

public class Ex1_StatictTest {
	
	String str1 = "�Ϲݸ������";
	static String str2 = "����ƽ ����";
	
	public void test1() {
		//�Ϲ� �޼��忡���� static������ �Ϲݺ��� ��� ��밡��
		str1 = "hi";
		str2 = "hello";
		//�Ϲ� �޼��忡���� staticŰ���带 ���� ������ ���������
		//static String str3 = "�ݰ�";
		
		
	}
	
	public static void test2() {
		//static�޼��忡���� �Ϲ� ������� ���Ұ�
		//str1 = "hi";
		str2 = "hello";
		
		int num = 100;//���������� �Ϲ� ������ ����ϴ°��� ����
		
		//static�޼��忡���� static������ ���������� �����Ұ�
		//static int num2 = 300;
	}
	
	
	
}





