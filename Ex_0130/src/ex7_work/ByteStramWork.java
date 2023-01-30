package ex7_work;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteStramWork {
	public static void main(String[] args) {
		
		//byte기반의 스트림을 사용할것
		//아무경로에 file.txt를 만들고 내용을 저장
		//저장된 file.txt를 읽어서 회문수인지 아닌지 판단하시오
		
		FileOutputStream fos = null;
		String path = "C:\\embedded_jy/file.txt";
		File f = new File(path);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값 : ");
		String ori = sc.next();// 원본값
		String rev = "";
		
		
		try {
			
			fos = new FileOutputStream(f);
					
			fos.write(ori.getBytes());
			
			for (int i = ori.length() - 1; i >= 0; i--) {

				rev += ori.charAt(i);

			} // for

			if (!ori.equals(rev)) {
				System.out.println(ori + "은(는) 회문수가 아님");
			} else {
				System.out.println(ori + "은(는) 회문수이다");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}//main
}
