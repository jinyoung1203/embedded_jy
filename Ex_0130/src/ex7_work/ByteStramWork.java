package ex7_work;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteStramWork {
	public static void main(String[] args) {
		
		//byte����� ��Ʈ���� ����Ұ�
		//�ƹ���ο� file.txt�� ����� ������ ����
		//����� file.txt�� �о ȸ�������� �ƴ��� �Ǵ��Ͻÿ�
		
		FileOutputStream fos = null;
		String path = "C:\\embedded_jy/file.txt";
		File f = new File(path);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� : ");
		String ori = sc.next();// ������
		String rev = "";
		
		
		try {
			
			fos = new FileOutputStream(f);
					
			fos.write(ori.getBytes());
			
			for (int i = ori.length() - 1; i >= 0; i--) {

				rev += ori.charAt(i);

			} // for

			if (!ori.equals(rev)) {
				System.out.println(ori + "��(��) ȸ������ �ƴ�");
			} else {
				System.out.println(ori + "��(��) ȸ�����̴�");
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
