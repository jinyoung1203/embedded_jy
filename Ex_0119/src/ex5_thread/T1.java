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
		//main에서 받은 값을 기준으로 1초에 1씩 감소시키며 출력
		try {
			
			for( int i = n; i >= 0; i-- ){
				
				System.out.println(i);
				Thread.sleep(1000);//1초 대기
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}









