package ex3_thread;

public class ThreadEx extends Thread{

	//스레드
	//스레드는 하나의 프로젝트에서 여러가지의 프로세스를 동시에
	//사용할 수 있도록 해 주는 독립적인 실행단위(영역)
	
	@Override
	public void run() {
		//독립적인 수행을 위한 영역
		for( int i = 0; i < 10; i++ ) {
			System.out.println("스레드 실행중");
		}
		
	}//run()
}
