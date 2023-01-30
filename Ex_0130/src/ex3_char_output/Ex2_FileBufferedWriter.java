package ex3_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex2_FileBufferedWriter {
	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			fw = new FileWriter("C:\\embedded_jy/bufferedWriter의 예제.txt", true);// true는 덮어쓰지 않고 작성한다
			bw = new BufferedWriter(fw);

			bw.write("첫번째 라인입니다");
			bw.newLine();// \n과 같은 엔터값에 해당하는 메서드
			bw.write("두번째줄");

			bw.flush();// 물리적으로 내용을 기록

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {

				// 역순으로 스트림들 닫아주기
				bw.close();
				fw.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// main
}
