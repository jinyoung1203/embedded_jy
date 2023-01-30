package work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		String[] data = {"apple", "banana", "grape", "orange"};
		
		WordGame wg = new WordGame(arr, data);
		wg.start();//스레드 시작
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(arr);
			System.out.print(">> ");
			String in = sc.next();
			
			if( arr.contains(in) ) {
				arr.remove(in);//단어삭제
			}
			
			//게임종료 시점
			if( arr.size() == 0 ) {
				System.out.println("클리어!!");
				wg.setPlaying(false);//스레드 종료
				break;
			}
		}
	}//main
}













