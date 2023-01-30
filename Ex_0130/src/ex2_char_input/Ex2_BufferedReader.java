package ex2_char_input;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2_BufferedReader {
	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader("C:\\embedded_jy/test.txt");
			br = new BufferedReader(fr);

			String msg = "";

			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				
				//char기반의 스트림 역시 생성된 역순으로 닫아주는게 좋다
				br.close();
				fr.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				
			}
			
		}

	}// main
}
