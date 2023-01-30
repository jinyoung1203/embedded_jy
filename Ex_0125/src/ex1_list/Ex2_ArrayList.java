package ex1_list;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> sList = new ArrayList<>();
		sList.add("장비");
		sList.add("전위");
		sList.add("황충");
		sList.add("길동");
		sList.add("조조");
		System.out.println(sList);
		
		sList.add(0, "관우"); 
		sList.add(0, "유비");
		sList.set(3, "조조"); 
		sList.set(4, "조운");
		sList.remove(5);
		sList.remove(5);
		System.out.println(sList);
		
		
	}//main
}
