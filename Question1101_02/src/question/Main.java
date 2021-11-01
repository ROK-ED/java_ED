package question;

public class Main {

	public static void main(String[] args) {
		Adder add = new Adder();
		Subtracter sub = new Subtracter();
//		add.run();
//		sub.run();
		System.out.println("---------");

		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
//		toDollar.run();
		System.out.println("---------");

		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
//			toMile.run();

		System.out.println("---------");
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

	}

}
