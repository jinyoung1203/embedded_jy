package ex7_work;

import java.io.FileReader;

public class CharStreamWork {
	public static void main(String[] args) {
		
		//char기반의 스트림 사용할것
		//특정경로에 cahr.txt파일을 만들고 아무 내용이나 넣는다
		//char.txt를 읽어서 내용에 알파벳 대문자와 소문자 갯수를 각각 출력
		
		//대문자 : 5
		//소문자 : 2
		
		String path = "C:\\embedded_jy/char.txt";
		FileReader fr = null;
		
		int upper = 0;//대문자
		int lower = 0;//소문자
		
		try {
			
			fr = new FileReader(path);
			
			int code = -1;
			
			while ( (code = fr.read() ) !=-1 ) {
				
				if (code >= 'A' && code <= 'Z') {
					upper++;
				}
				
				if (code >= 'a' && code <= 'z') {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : "+ lower);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
	}//main
}
