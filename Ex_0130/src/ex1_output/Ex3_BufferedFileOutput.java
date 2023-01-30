package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			fos = new FileOutputStream("C:\\embedded_jy/bos의 예제.txt");
			bos = new BufferedOutputStream(fos);

			String str = "BufferedOutputStream의 예제";
			bos.write(str.getBytes());

			// 내용을 물리적으로 기록하기 위한 메서드
			// flush사용시 스트림 역순 저장이 필수는 아니다
			bos.flush();

		} catch (Exception e) {
			// TODO: handle exception

		} finally {

			try {

				// 스트림은 생성된 역순으로 저장
				bos.close();
				fos.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}// main
}
