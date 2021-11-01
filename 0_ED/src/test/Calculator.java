package test;

public class Calculator {
	//필드
	private int x=0;
	private int y=0;
	//생성자
//	public Calculator() {
//		this.x=0;
//		this.y=0;
//	}
	
    //메소드
	public void powerOn() {
//		리턴타입x     매개변수x
		System.out.println("전원을 켭니다.");
	}

	// 전원을 끈다.
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	// 더하기
//	public int plus(int x, int y) {
//		// void가 아닌 리턴타입을 넣으면 리턴값을 넣어야된다.
//		int result = x + y;
//		return result;
		
		public int plus(int x, int y) {
			// void가 아닌 리턴타입을 넣으면 리턴값을 넣어야된다.
			
			return x + y;

	}
}