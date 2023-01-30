package work;

import java.util.ArrayList;
import java.util.Random;

public class WordGame extends Thread{

	private ArrayList<String> arr;
	private String[] data;
	
	//스레드 정지용 변수
	private boolean playing = true;
	
	//생성자
	public WordGame(ArrayList<String> arr, String[] data) {
		this.arr = arr;
		this.data = data;
	}
	
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	@Override
	public void run() {
		//3초 간격으로 arr에 단어 추가!
		while( playing ) {
			
			int rnd = new Random().nextInt( data.length );
			
			arr.add( data[rnd] );
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
	}
	
}










