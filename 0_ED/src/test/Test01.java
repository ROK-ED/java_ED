package test;


public class Test01 {
		 static int[] searchIdx(int[] a, int n, int key, int[] idx) {
		      n = -1;
		      for (int i = 0; i < a.length; i++) {
		         if (a[i] == key) {
		            idx[++n] = i;
		         }
		      }
		      return idx;
		   }

		   public static void main(String[] args) {
//		      Scanner sc = new Scanner(System.in);
//		      System.out.println("요소수");
//		      int num = sc.nextInt();
		      int a[] = { 1, 9, 2, 9, 4, 6, 7, 9 };
		      int idx[] = null;
		      int count = 0;
		      int key = 9;

		      searchIdx(a, count, key, idx);
		      System.out.println("result" + count);
		      for (int i = 0; i < idx.length; i++) {
		         System.out.println(idx[i]);
		      }
		   }
}