package Ex1_setter_getter;

public class Person {
	// setter & getter : private로 만들어진 속성에 접근할수 있도록 하기 위한 개념

	private String brand = "samsung";
	private String name;
	private String phone;
	private int age;

	// this. = 현재 클래스 자신
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
