package Ex2_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, { "[lee]", "백두산", "내부자들", "광해" },
				{ "[ryo]", "올뺴미", "럭키", "타짜" } };

		// 검색할 배우 : song
		// [song]
		// 박쥐
		// 괴물
		// 관상
		// ------------검색이 올바르게 됐습니다

		// 검색할배우 : park
		// 해당배우는 없습니다

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 이름 : ");
		String name = sc.next();

		int count = 0;

		for (int i = 0; i < actor.length; i++) {

			if (actor[i][0].equalsIgnoreCase("[" + name + "]")) {

				for (int j = 0; j < actor[i].length; j++) {

					System.out.println(actor[i][j]);

				} // inner

			} else {

				count++;

				if (count == actor.length) {

					System.out.println("해당 배우의 이력이 등록되어있지 않습니다");
					
				}
			}

		} // outer

	}// main
}
