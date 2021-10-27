package chapter06_Review;

public class PointOfSale {
	//필드
	private Product[] productList;
	private int sales;
	private int productNum = 0;
	
	//생성자
	public PointOfSale() {
		this.productList = new Product[10];
		this.sales = 0;
	}
	
	//메소드
	
	// 어떤 제품을 가지고 있고
	// 그 제품별 재고가 몇개씩 있는지
	// 그 제품들을 판매하고 나서 재고가 변경이 되느지
	// 판매한 매출액이 얼마인지
	
	// 제품목록에 제품 추가
	public void addProduct(String name, int price, int stock) {
		Product product = new Product(name, price);
		product.setInventory(stock);
		productList[productNum++] = product;
		
	}
	// 재고확인
	public void getProductList() {
		if(productNum == 0) {
			System.out.println("제품이 없습니다");
			return;
		}
		for(int i=0; i<productNum; i++) {
			System.out.println(productList[i].getName() + "제품의 재고는 " + productList[i].getInventory() +"입니다.");
		}
	}
	
	// 판매 -> 1. 판매된 제품에 대한 재고 변경 
	//		  2. 판매된 금액만큼 매출액 증가
	public boolean saleGoods(String name, int amount) {
		boolean isInStock = true;
		for(int i=0; i<productNum; i++) {
			
			Product product = productList[i];
			if(name.equals(product.getName())) {
				
				int inventory = product.getInventory();
				if((inventory - amount) >=0) {
					product.setInventory(inventory - amount);
					this.sales += product.getPrice() * amount;
				}else {
					isInStock = false;
				}
			}
		}
		return isInStock;
	}
	// 매출액확인
	public void getSales() {
		System.out.println("현재까지 매출액은 " + this.sales + "입니다.");
	}
	
}
