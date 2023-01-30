package ex2_char_input;

import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;

		try {

			fr = new FileReader("C:\\embedded_jy/test.txt");

			int code = -1;

			while ((code = fr.read()) != -1) {

				// fr�� �⺻������ 2byte������ �ѱ۵��� �����ڵ� ���·� �о���°��� �����ϹǷ�
				// byte[]���� �����ʿ䰡 ����!!
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
