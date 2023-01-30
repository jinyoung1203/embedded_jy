package ex5_object_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterMain {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("홍길동");
		p.setAge(20);

		String path = "C:\\embedded_jy/person.sav";

		// 객체를 통째로 출력하는데 사용하는 output stream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(p);// Person객체를 저장

		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {

			try {

				oos.close();
				fos.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// main
}
