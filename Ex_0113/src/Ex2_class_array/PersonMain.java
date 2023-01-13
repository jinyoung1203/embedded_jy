package Ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {

//		String[] sArr = new String[3];
//		sArr[0] = "aaa";
//		sArr[1] = "bbb";
//		sArr[2] = "ccc";
//		
//		System.out.println(sArr);

		// String 클래스를 제외한 모든 클래스들은
		// 배열화 처리했을떄 각 인덱스마다 메모리할당을 해 줘야 한다
		Person[] person = new Person[3];

		// person[0] = new Person();
		// person[1] = new Person();
		// person[2] = new Person();

		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
		}

		person[0].setName("홍길동");
		person[0].setAge(20);

		person[1].setName("공유");
		person[1].setAge(21);

		person[2].setName("이창훈");
		person[2].setAge(23);

		// 홍길동 / 20
		// 공유 / 21
		// 이창훈 / 23

		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].getName() + "/" + person[i].getAge());
		}

	}// main
}
