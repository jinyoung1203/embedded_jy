package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		//1) 4���� 30�ϱ��� �ֽ��ϴ�.
		//2) 15���� �����ϴ�
		int month = 14;
		
		switch( month ) {
		
		//31���� �ִ� ��
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�");
			break;
		
		//30���� �ִ� ��
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�");
			break;
			
		case 2:
			System.out.println("2���� 28�ϱ��� �ֽ��ϴ�");
			break;
			
		default:
			System.out.println(month + "���� �����");
			break;
		}//switch
		
	}//main
}















































