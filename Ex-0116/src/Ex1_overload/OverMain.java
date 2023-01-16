package Ex1_overload;

public class OverMain {
	public static void main(String[] args) {
		
		Ex1_overload ov = new Ex1_overload();
		ov.result();
		ov.result(10);
		ov.result('A');
		ov.result("hello");
		ov.result("hi", 100);
		ov.result(1000, "hi");
		
		//println - 오버로드의 예시
		System.out.println(100);
		System.out.println("hi");
		
		//System.out.printInt(100);X
		//System.out.printString("hi");X
	}//main
}
