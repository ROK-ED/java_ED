package chapter06_Review;

public class MainExample {

	public static void main(String[] args) {
		//포스기
		//제품(제품명, 가격, 재고) / 매출액
		//-> 포스기 / 제품
		
		PointOfSale pos = new PointOfSale();
		
		pos.getProductList();
		System.out.println();
		pos.addProduct("사과", 1000, 5);
		pos.addProduct("오렌지", 1500, 10);
		pos.addProduct("바나나", 4000, 7);
		
		pos.getProductList();
		System.out.println();
		
		if(!pos.saleGoods("사과", 4)) {
			System.out.println("해당 제품에 대한 재고가 부족합니다.");
		}else {
			System.out.println("정상적으로 판매되었습니다.");
		}
		System.out.println();
		
		if(!pos.saleGoods("사과", 2)) {
			System.out.println("해당 제품에 대한 재고가 부족합니다.");
		}else {
			System.out.println("정상적으로 판매되었습니다.");
		}
		System.out.println();
		
		pos.getProductList();
		pos.getSales();
	}

}
