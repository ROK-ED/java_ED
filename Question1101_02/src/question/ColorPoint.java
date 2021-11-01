package question;

public class ColorPoint extends Point {
	String color;

	public ColorPoint(int x, int y,String color) {
		super(x, y);
		this.color=color;
	}

	public void setPoint(int x, int y) {
		move(x,y);
	}

	public void setColor(String color) {
		this.color = color;		
	}

	public void show() {
		System.out.println(color+"색으로 ("+getX()+","+getY()+")");
		
	}
	
	

	
}
