package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		//�߰� : abc
		//[abc]
		//�߰� : aabb
		//[abc, aabb]
		//�߰� : abc
		//�ߺ��� ���̵�
		//�߰� : exit
		//����
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		outer : while(true) {
			
			System.out.print("�߰� : ");
			String id = sc.next();
			
			//���̵� �ߺ�üũ1
//			for( int i = 0; i < list.size(); i++ ) {
//				
//				if( id.equals(list.get(i)) ) {
//					
//					System.out.println("�ߺ��� ���̵�");
//					//�ߺ��� ���̵��� list.add���� �������� ���ϵ��� �Ѵ�
//					continue outer;
//					
//				}
//				
//			}
			
			//���̵� �ߺ�üũ2
			if( list.contains(id) ) {//list.contains(id) == true
				System.out.println("�ߺ��� ���̵�");
				continue outer;
			}
			
			if( id.equalsIgnoreCase("exit") ) {
				System.out.print("����");
				break;
			}
			
			list.add(id);
			
			System.out.println(list);
			
		}//while
		
	}//main
}






























