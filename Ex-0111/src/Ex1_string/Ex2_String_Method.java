package Ex1_string;

import java.util.Scanner;

public class Ex2_String_Method {
	public static void main(String[] args) {
	
		//StringŬ������ �޼���(���)��
		//� �۾��� �����ϱ� ���� ��ɹ����� ����ü
		//�ݺ������� ���Ǵ� �ڵ带 ���̱����� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		String name = "Hong Gil Dong";
		
		//length�� 1���� ����
		int len = name.length();
		System.out.println("������ ���� : " +len);
		
		int index = name.indexOf('o');
		System.out.println("�� ù���� o�� ��ġ : "+ index);
		
		index = name.lastIndexOf('o');
		System.out.println("�� ���� o�� ��ġ: "+ index);
		
		char c = name.charAt(5);
		System.out.println("������ ���� : " + c);
		
		String s1 = name.substring(5);
		System.out.println("5���� ��ġ���� ��� ���� �߶󳻽ÿ� : " +s1);
		
		//10���� 9���� ��� end-1���
		s1 = name.substring(5, 10);
		System.out.println("5~9��° ������ ������ �߶󳻽ÿ� : " +s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replace(".�� /�� ġȯ :" , "/");
		System.out.println(".�� /�� ġȯ : " +s1);
		
		name = name.replace("on", "ii");
		System.out.println("on��ii�� ġȯ : " +name);
		
		name = name.replaceAll("ii", "oo");
		System.out.println("ii��on�� ġȯ : " +name);
		
		name = "Kim. Lee. park.";
		String name2 = "Kim. Lee. park.";
		
		name = name.replace('.', '/');
		System.out.println("replace : " + name);
		
		//.���� ������ �����Ѵ�
		//ii���� ���ڴ� ���ڸ� ġȯ��Ų��
		name2 = name2.replaceAll(".", "/");
		System.out.println("replaceAll : " +name2);
		
		String id = " hi hello ";
		id = id.trim();//���� �յ��� �ǹ̾��� ������ ����
		System.out.println("trim������� ���� : " +id.length());
		
		//Ư�� ������ �迭������ ������ �������ִ� �޼���
		String[] id2 = id.split(" ");
		System.out.println(id2[0] + "/" + id2[1]);
		
		//��ҹ��ڸ� �����Ͽ� �������Ѵ�
		//equalsIgnoreCase�� �ܾ ���ٸ� �Ű澲�� �ʴ´�
		String answer = "apple";
		
		if (answer.equalsIgnoreCase("apple")) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� �ٸ���");
		}
		
		//��Ʈ�� Ŭ������ �޼���� �ƴ����� ������ ���� ����ϰԵ� �޼���
		//���������� ���ڿ�(String)�� ������ ������ ���� ������ �ٲ���
		String num = "10";
		int a = Integer.parseInt(num);
		System.out.println( a + 1 );
		
	}//main
}




























