package chapter06_Review;

public class Product {
	//제품(제품명, 가격, 재고)
	
	//필드
	private String name;
	private int price;
	private int inventory;
	
	//생성자
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	
}
