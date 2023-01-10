package Ex1_multi_array;

import java.util.Scanner;

public class Ex5_multi_arry {
	public static void main(String[] args) {
		//학생들의 이름, 수학, 영어성적을 등록하고 한번에 출력
		//첫 실행시 몇명의 정보ㅡㄹ 입력할것인지 키보드에서 받아서
		//학생정보 등록 및 출력을 진행해보자
		
		//등록인원 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 87
		//----------
		//이름 : kim
		//수학 : 40
		//영어 : 27
		//-------------
		//2명 등록 완료
		//hong 90 87
		//kim 40 27
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원 : ");
		int n = sc.nextInt();
		
		String[] info = {"이름 : ", "수학 : ", "영어 : "};
		String[][] str = new String[n][info.length];
		
		for (int  i= 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				
				System.out.print(info[j]);
				str[i][j] = sc.next();
				
			}//inner
			
			System.out.println("--------");
			
		}//outer
		
		System.out.println(n + "명 등록완료!");
		for (int i = 0; i < str.length; i++) {
			
			for (int j = 0; j < str[i].length; j++) {
				
				System.out.printf("%s\t", str[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
	}//main
}




















