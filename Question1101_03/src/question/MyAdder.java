package question;

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int add(int n) {
		int a =(n/2)*10+(n/2);
		return a;
	}
	
	public static void main(String[] args) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
