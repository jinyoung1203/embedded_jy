package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		//2중 for문을 사용하여 아래의 결과를 도출하시오
		
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//   .............
		//10 1 2 3 4 5 6 7 8 9 
		for( int i = 1; i <= 10; i++ ) {
			
			for( int j = 0; j < 10; j++ ) {
				
				int num = i + j;
				
				if( num > 10 ) {
					num -= 10;
				}
				
				System.out.print( num + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-------------------------");
		
		//1부터 n까지의 총 합을 출력하시오
		//결과 : 6
		int n = 5;
		int res = 0;
		
		for( int i = 1; i <= n; i++ ) {
			res += i;
		}
		
		System.out.println("결과 : " + res);
		
	}//main
}


















































