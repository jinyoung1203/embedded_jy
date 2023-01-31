package ex8_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;





public class GameLoad {
	
	Rsp rsp;
	
	public Rsp scoreLoder( String id ) {
		
		String path = "C:\\embedded_jy/RspGame/" + id + ".sav";
		
		File f = new File("C:\\embedded_jy/RspGame/");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if (f.exists()) {
			
			try {
				
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				rsp = (Rsp)ois.readObject();
						
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		return rsp;
		
	}
		
		
		
	}
	



