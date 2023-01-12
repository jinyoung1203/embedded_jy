package Ex4_Method;

public class Ex1_paramMain {
	public static void main(String[] args) {
		
		Ex1_param e1 = new Ex1_param();
		
		String str = "안녕";
		
		e1.test1(str);
		
		System.out.println("main : " +str);
		
		System.out.println("----------");
		
		//배열을 넘기는것이 아닌 주소값을 넘긴다
		int [] arr = {1, 2, 3};
		e1.test2(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}//main
}















