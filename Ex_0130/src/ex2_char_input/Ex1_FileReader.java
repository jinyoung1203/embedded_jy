package ex2_char_input;

import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;

		try {

			fr = new FileReader("C:\\embedded_jy/test.txt");

			int code = -1;

			while ((code = fr.read()) != -1) {

				// fr는 기본적으로 2byte문자인 한글등을 유니코드 형태로 읽어오는것이 가능하므로
				// byte[]등을 만들필요가 없다!!
				System.out.print((char) code);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}// main
}
