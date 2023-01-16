package Ex4_constructor;

public class Pen {

	private String brand;
	private String color;
	private int price;

	public Pen(String color , int price) {
		this.color = color;
		this.price = price;
		brand = "monami";
		
	}
	
	public Pen() {
		//System.out.println("Pen의 생성자");
		brand = "monami";
		color = "black";
		price = 500;
	}
	
	public void result() {
		System.out.println("브랜드 : " + brand);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("----------");
	}
	
}
