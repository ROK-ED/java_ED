package question;

import java.util.Scanner;

public class StarkApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int capacity = scanner.nextInt();
		int capacity = 3;
		String[] a= new String[capacity];
		for(int i=0; i<a.length; i++) {
			System.out.println("문자열 입력 >>");
			String pop = scanner.next();
			a[i] = pop;
		}
		
		

	}

}
