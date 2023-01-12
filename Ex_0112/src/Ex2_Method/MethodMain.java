package Ex2_Method;

public class MethodMain {
	public static void main(String[] args) {
		
		Method1 m1 = new Method1();
		m1.test1();
		
		int su = 100;
		su = m1.test2(su);
		System.out.println("su : " +su);
		
		String res = m1.test3("¾ÈÁø¿µ", 23);
		System.out.println(res);
		
		res =	m1.test3("kim", 22);
		System.out.println(res);
		
	}//main
}
