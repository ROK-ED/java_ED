package pos;

public class Goods {
	private String name; // 상품 명
	private int money; // 상품 가격

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money < 0) {
			this.money = 0;
			return;
		} else {
			this.money = money;
			return;
		}

	}
}
