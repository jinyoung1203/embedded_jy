package ex3_io_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/embedded_jyh";
		File f = new File(path);
		
		//f�� ������ path��ΰ� ������ ��� true
		if( f.isDirectory() ) { //!f.isFile()
			System.out.println("---���� Ŭ������ ������ ������ϵ�---");
			
			//f�� ������ ������ ���� ������� �̸��� ��Ƶδ� �޼���
			String[] str = f.list();
			
			for( int i = 0; i < str.length; i++) {
				
				System.out.println(str[i]);
				
			}//for
		}
		
	}//main
}








