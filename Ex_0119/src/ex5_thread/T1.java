package ex5_thread;

public class T1 extends Thread{

	private int n;
	
	public void setN(int n) {
		this.n = n;
	}
	
//	public T1(int n) {
//		this.n = n;
//	}
	
	@Override
	public void run() {
		//main���� ���� ���� �������� 1�ʿ� 1�� ���ҽ�Ű�� ���
		try {
			
			for( int i = n; i >= 0; i-- ){
				
				System.out.println(i);
				Thread.sleep(1000);//1�� ���
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}









