package ex9_break_continue;

public class Ex6_label {
	public static void main(String[] args) {
		
		label : for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					continue label;
				}
				
				System.out.printf("%d ", j);
				
			}//inner			
			
			System.out.println();
			
		}//outer
		
	}//main
}






