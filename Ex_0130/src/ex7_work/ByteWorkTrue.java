package ex7_work;

import java.io.File;
import java.io.FileInputStream;

public class ByteWorkTrue {
	public static void main(String[] args) {
		
		String path = "C:\\embedded_jy/file2.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		String ori = "";//����
		String rev = "";//������ ����� ������ ����
		
		try {
			
			fis = new FileInputStream(f);
			fis.read(b_read);
			
			//�о�� ������ ori�� ����
			ori = new String(b_read).trim();
			
			//���� ����� rev������ ����
			for (int i = ori.length()-1; i >= 0; i--) {
				
				rev += ori.charAt(i);
				
			}//for
			
			//ȸ�����Ǵ�
			if (ori.equals(rev)) {
				System.out.println(ori+" : ȸ����");
			}else {
				System.out.println(rev + " : ȸ�������ƴ�");
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
