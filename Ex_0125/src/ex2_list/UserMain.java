package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		//이름 : aaa
		//나이 :20
		//aaa / 20
		//---------------
		//이름 : bbb
		//나이 :30
		//aaa / 20
		//bbb / 30
		//----------------
		//이름 : aaa
		//이름이 중복됩니다
		//----------------
		//이름 : ...
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<User> list = new ArrayList<>();
		
		outer : while(true) {
			User u = new User();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			//이름 중복체크
			for( int i = 0; i < list.size(); i++ ) {
				if( list.get(i).getName().equals(name) ) {
					System.out.println("이름중복");
					System.out.println("--------------------");
					continue outer;
				}
			}//for
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			u.setName(name);
			u.setAge(age);
			list.add(u);
			
			//결과 출력
			for( int i = 0; i < list.size(); i++  ) {
				System.out.printf("%s / %d\n", list.get(i).getName(), list.get(i).getAge() );
			}
			
			System.out.println("----------------");
			
		}//while
		
		
	}//main
}











