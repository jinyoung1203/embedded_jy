package Ex2_overload;

public class Bread {
	//메서드1
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	}
	//메서드2
	public void makeBread(int count) {
		
		for (int i = 0; i < count; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.printf("%d개의 빵을 만들었어요\n",count);
		
	}
	//메서드3
	public void makeBread(String name, int count) {
		
		for (int i = 0; i < count; i++) {
			
			System.out.printf("%s을 만들었습니다\n",name);
			
		}
		System.out.printf("%d개의%s(을)를 만들었습니다",count,name);
	}
	
}











