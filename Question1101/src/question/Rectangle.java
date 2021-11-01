package question;

public class Rectangle {
	//필드
	private double width;
	private double length;
	//생성자
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	
	//메소드
	public double getArea() {
		return width * length;
	}
	
	public double getCircumference() {
		return (width*2) + (length*2);
	}
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
		
	}
}
