package Question;

public class Q0402 {
	public static void main(String[] args) {
		// 문제2
		System.out.println("문제2==============================");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				continue;
			}
		}
		System.out.println(sum);

		// 문제3
		System.out.println("문제3==============================");
		int dice = 0;
		int dice2 = 0;
		int sum2 = 0;
		int count2 = 0;

		while (true) {
			dice = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice + "," + dice2 + ")");
			sum2 = dice + dice2;
			count2++;
			if (sum2 == 5) {
				break;
			}
		}
		System.out.println(count2);

		// 문제4
		System.out.println("문제4==============================");
				
			for (int x = 1; x <= 10; x++) {
			

				for (int y = 1; y <= 10; y++) {
					
					while (4*x + 5*y == 60) {
						System.out.println(x+","+y);
						break;
					}

				}

		}
		
			// 문제5
			System.out.println("문제5==============================");
			
			String tree = "";
		
			for(int x=1; x<=4; x++) {
				tree += "*";
				System.out.println(tree);
			}
			
			// 문제6
			System.out.println("문제6==============================");
			
			String tree2 = "";
			String space = "";
			int q6 = 6;
			
			
			for(int x=1; x<=q6; x++) {
				for(int y=q6; y>=1; y--) {
					if( x<y ) {
//						tree2 +=" ";
						System.out.print(" ");
					} else {
//						tree2 +="*";
						System.out.print("*");
					}
				}
			System.out.println(" ");
			}
//			System.out.println(tree2);

		
		
		
		
		
		
		
		
		
	}

}
