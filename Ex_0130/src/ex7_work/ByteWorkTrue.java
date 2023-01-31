package ex7_work;

import java.io.File;
import java.io.FileInputStream;

public class ByteWorkTrue {
	public static void main(String[] args) {
		
		String path = "C:\\embedded_jy/file2.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		String ori = "";//원본
		String rev = "";//원본을 뒤집어서 저장할 변수
		
		try {
			
			fis = new FileInputStream(f);
			fis.read(b_read);
			
			//읽어온 원본을 ori에 저장
			ori = new String(b_read).trim();
			
			//원본 뒤집어서 rev변수에 저장
			for (int i = ori.length()-1; i >= 0; i--) {
				
				rev += ori.charAt(i);
				
			}//for
			
			//회문수판단
			if (ori.equals(rev)) {
				System.out.println(ori+" : 회문수");
			}else {
				System.out.println(rev + " : 회문수가아님");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				fis.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}//main
}
