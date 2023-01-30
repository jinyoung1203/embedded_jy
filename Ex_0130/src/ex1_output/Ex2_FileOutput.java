package ex1_output;

import java.io.File;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		String path = "C:\\embedded_jy/fileOutput예제.txt";
		File f = new File(path);

		try {

			fos = new FileOutputStream(f, true);
			String msg = "new라인을 입력해";
			String msg2 = "\n반가워요";

			// msg.getBytes():String타입의 문장을 byte[]로 변경해주는 메서드
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}// main
}
