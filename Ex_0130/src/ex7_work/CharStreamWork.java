package ex7_work;

import java.io.FileReader;

public class CharStreamWork {
	public static void main(String[] args) {
		
		//char����� ��Ʈ�� ����Ұ�
		//Ư����ο� cahr.txt������ ����� �ƹ� �����̳� �ִ´�
		//char.txt�� �о ���뿡 ���ĺ� �빮�ڿ� �ҹ��� ������ ���� ���
		
		//�빮�� : 5
		//�ҹ��� : 2
		
		String path = "C:\\embedded_jy/char.txt";
		FileReader fr = null;
		
		int upper = 0;//�빮��
		int lower = 0;//�ҹ���
		
		try {
			
			fr = new FileReader(path);
			
			int code = -1;
			
			while ( (code = fr.read() ) !=-1 ) {
				
				if (code >= 'A' && code <= 'Z') {
					upper++;
				}
				
				if (code >= 'a' && code <= 'z') {
					lower++;
				}
				
			}//while
			
			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : "+ lower);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
	}//main
}
