package TEST;

import java.util.Scanner;

public class TESTMain {

//		사용자가 현재 가지고 있는 돈을 입력받고, 크림빵, 새우깡, 콜라를 잔돈을 하나도 남기지 않
//		고 구입하는 경우의 수를 모두 출력하기. 단, 사용하지 않는 상품이 있으면 안된다. 크림빵 500원, 새우깡 700원, 콜라 400원. 결과 :
//		당신이 소유한 금액 : 4000
//		크림빵 : 1개, 새우깡 : 1봉지, 콜라 : 7캔
//		크림빵 : 2개, 새우깡 : 2봉지, 콜라 : 4캔
//		크림빵 : 3개, 새우깡 : 3봉지, 콜라 : 1캔
//		크림빵 : 5개, 새우깡 : 1봉지, 콜라 : 2캔

	public static void main(String[] args) {

		int cream = 500;
		int shrimp = 700;
		int coke = 400;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오 : ");
		money = sc.nextInt();

		for (int i = 0; money - i * cream>0; i++) {
			for (int j = 0; money - j * shrimp>0; j++) {
				for (int k = 0; money - k * coke>0; k++) {
					if (money == i * cream + j * shrimp + k * coke) {
						System.out.println("크림빵 : " + i + " 개, 새우깡 : " + j + "봉지, 콜라 : " + k + "캔");

					}
				}

			}
		}
	}// main

}
