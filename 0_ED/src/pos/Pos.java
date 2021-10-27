package pos;

public class Pos {
	//필드
	private int visitNo; //방문자 순
	private Goods[] goodsList; //상품 목록
	private int goodsIndex = 0; //구매 상품 수
	
	//생성자
	public Pos(int visitNo,int goodsIndex) {
		//방문자수 초기화
		this.visitNo = visitNo;
		//구매 상품수 초기화
		this.goodsList = new Goods[goodsIndex];
	}
	
		public void addGoods(String name, int money) {
		//상품목록 담을 인스턴스 생성
		Goods goods = new Goods();
		//매개변수를 통해 상품명 추가하기
	    goods.setName(name);
	    //매개변수를 통해 가격 추가하기
	    goods.setMoney(money);
	    //배열에 저장하기
	    goodsList[goodsIndex++] = goods;
		
	}
	

}
