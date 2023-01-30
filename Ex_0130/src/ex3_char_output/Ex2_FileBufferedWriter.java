package ex3_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex2_FileBufferedWriter {
	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			fw = new FileWriter("C:\\embedded_jy/bufferedWriter�� ����.txt", true);// true�� ����� �ʰ� �ۼ��Ѵ�
			bw = new BufferedWriter(fw);

			bw.write("ù��° �����Դϴ�");
			bw.newLine();// \n�� ���� ���Ͱ��� �ش��ϴ� �޼���
			bw.write("�ι�°��");

			bw.flush();// ���������� ������ ���

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {

				// �������� ��Ʈ���� �ݾ��ֱ�
				bw.close();
				fw.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// main
}
