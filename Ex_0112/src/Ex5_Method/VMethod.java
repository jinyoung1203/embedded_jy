package Ex5_Method;

public class VMethod {
	
	//int...n <-- variable arguments
	//������ ������ ���� �Ķ��Ÿ ��� ����
	public void v_test(int ... n) {
		//n = {1, 2, 3, 4}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}//for
		
	}//v_test
	
}
