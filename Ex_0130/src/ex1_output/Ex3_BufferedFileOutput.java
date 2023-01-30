package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			fos = new FileOutputStream("C:\\embedded_jy/bos�� ����.txt");
			bos = new BufferedOutputStream(fos);

			String str = "BufferedOutputStream�� ����";
			bos.write(str.getBytes());

			// ������ ���������� ����ϱ� ���� �޼���
			// flush���� ��Ʈ�� ���� ������ �ʼ��� �ƴϴ�
			bos.flush();

		} catch (Exception e) {
			// TODO: handle exception

		} finally {

			try {

				// ��Ʈ���� ������ �������� ����
				bos.close();
				fos.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}// main
}
