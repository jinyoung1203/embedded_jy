package Ex1_setter_getter;

public class Person {
	// setter & getter : private�� ������� �Ӽ��� �����Ҽ� �ֵ��� �ϱ� ���� ����

	private String brand = "samsung";
	private String name;
	private String phone;
	private int age;

	// this. = ���� Ŭ���� �ڽ�
	// souce > ger.get.set

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}

}
