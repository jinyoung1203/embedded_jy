package Ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {

//		String[] sArr = new String[3];
//		sArr[0] = "aaa";
//		sArr[1] = "bbb";
//		sArr[2] = "ccc";
//		
//		System.out.println(sArr);

		// String Ŭ������ ������ ��� Ŭ��������
		// �迭ȭ ó�������� �� �ε������� �޸��Ҵ��� �� ��� �Ѵ�
		Person[] person = new Person[3];

		// person[0] = new Person();
		// person[1] = new Person();
		// person[2] = new Person();

		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
		}

		person[0].setName("ȫ�浿");
		person[0].setAge(20);

		person[1].setName("����");
		person[1].setAge(21);

		person[2].setName("��â��");
		person[2].setAge(23);

		// ȫ�浿 / 20
		// ���� / 21
		// ��â�� / 23

		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].getName() + "/" + person[i].getAge());
		}

	}// main
}
