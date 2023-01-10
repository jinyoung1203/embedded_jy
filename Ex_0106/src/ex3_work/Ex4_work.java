package ex3_work;

public class Ex4_work {
	public static void main(String[] args) {

		int num = 1;

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print(num++ + "\t");

			} // inner

			System.out.println();

		} // outer

		System.out.println("------------------");

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				
				System.out.printf("%d * %d = %d \t",j,i,j*i);
				//System.out.print(j + " * " + i + " = " + j * i + "\t");
				
			} // inner
			
			System.out.println();

		} // outer

	}// main
}
