package ex2_switch;

public class Ex5_work {
	public static void main(String[] args) {
		
		//8 * 3 = 24
		
		int su1 = 8;
		int su2 = 3;
		char op = '*';//+, -, *, /, %�� �ϳ� ���ϴ� ������ �ֱ�
		
		switch( op ) {
		case '+':
			System.out.println( su1 + " + " + su2 + " = " + (su1 + su2)  );
			break;
			
		case '-':
			System.out.println( su1 + " - " + su2 + " = " + (su1 - su2) );
			break;
			
		case '*':
			System.out.println( su1 + " * " + su2 + " = " + su1 * su2 );
			break;
		}//switch
		
	}//main
}














































