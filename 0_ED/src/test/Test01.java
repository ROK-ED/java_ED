package test;


public class Test01 {
	public static void main(String[] args) {
		int min = 2147483647;
		System.out.println(min);
	
	
	Calculator cal = new Calculator();
	
	cal.powerOn();
	System.out.println(cal.plus(5, 3));
	
	Car myCar = new Car("포르쉐");
	Car yourCar = new Car("벤츠");
	
	myCar.run();
	yourCar.run();
	

}
}