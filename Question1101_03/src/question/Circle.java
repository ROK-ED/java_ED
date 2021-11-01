package question;

public class Circle implements Shape {
	int r;

	public Circle(int r) {
		this.r=r;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getArea() {
		System.out.print("반지름"+r+" ");		
		return r*r*PI;
				
	}
	
	 public static void main(String[] args) {
			Shape coin = new Circle(10);
			coin.redraw();
			System.out.println("코인의 면적은 " + coin.getArea());
		}

}
