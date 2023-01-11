package TEST;

import java.util.Scanner;

public class Ex2_test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드 입력기 생성
        int     Square[][] = new int [100][100];
        int     iCount , i , j , x , y, index , a , b;
         
        System.out.println("마방진의 크기는 = "); // 값의 범위 출력
        iCount = scanner.nextInt();
        x = (iCount / 2);
        y = (iCount / 2) * -1;
        index = 1;
        for(j=0;j<iCount;j++) {
            for(i=0;i<iCount;i++) {
                a = ((x+i) + iCount) % iCount;
                b = ((y+i) + iCount) % iCount;
                Square[a][b] = index;
//              System.out.printf("[%d][%d] = %d\n",x,y,index);                 
                index++;
            }
            x = x - 1;
            y = y + 1;
        }
        System.out.println("마방진의 결과는 = "); // 값의 범위 출력
        for(j=0;j<iCount;j++) {
            for(i=0;i<iCount;i++) System.out.printf("%4d",Square[i][j]);
            System.out.println();                   
        }
    }
}
