package ex3_char_output;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {

		FileWriter fr = null;

		try {

			fr = new FileWriter("C:\\embedded_jy/fileWriter�� ����.txt", true);

			String str = "first line\n";
			String str2 = "�ι� ° ��";

			// fr�� �⺻������ 2byte�� �����ϱ� ������ getByte()������
			// byte[]������ �ɰ��� �ʾƵ� ����
			fr.write(str);
			fr.write(str2);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {

				fr.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// main
}