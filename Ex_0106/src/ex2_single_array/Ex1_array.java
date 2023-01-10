package ex2_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//배열 : '같은 자료형'끼리 모아둔 하나의 묶음
		//효율적인 자료관리를 위해 '반드시'알고 있어야 하는 개념
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1)배열 선언
		int[] arr;
		
		//2)배열 생성
		arr = new int[4];
		
		//3)초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//배열에 존재하지 않는 index에는 값을 추가하거나 가져다 쓸 수 없다. 
		//arr[4] = 50;
		
		System.out.println("20필요해 : " + arr[0]);
		
		System.out.println("------------------------");
		
		//배열이름.length : 배열의 방 갯수
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = (i + 1) * 100;
			System.out.println( arr[i] );
		}		
		
	}//main
}











































