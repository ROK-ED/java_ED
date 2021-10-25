package com.java.yedam.test;

import java.util.Scanner;

import com.java.yedam.feedback.Product;

public class test3 {
	public static void main(String[] args) {
		
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
				// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
				// 1) 메뉴는 다음과 같이 구성하세요.
				// 1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
				// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
				// 3) 제품별 가격을 출력하세요.
				//	출력예시, "상품명 : 가격"
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.

				Scanner scanner = new Scanner(System.in);
				//int[] products = null;
				Product[] products = null;
				int productNum = 0;

				boolean run = true;

				while (run) {
					System.out.println("=== 1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ===");
					System.out.println("선택 수>");
					int selectNo = scanner.nextInt();

					switch (selectNo) {
					case 1:
						System.out.println("상품 수 > ");
						productNum = scanner.nextInt();
						products = new Product[productNum];
						break;
					case 2:
						for (int i = 0; i < products.length; i++) {
							System.out.println("상품명 >");
							String name = scanner.next();
							System.out.println("가격 >");
							int price = scanner.nextInt();
							
							Product product = new Product(name, price);
							products[i] = product;
						}
						break;
					case 3:
						for (int i = 0; i < products.length; i++) {
							Product product = products[i];
							System.out.printf("%s: %d\n",product.getName(), product.getPrice());
						}
						break;
					case 4:
						// 최고 가격을 가지는 제품
						int max = 0;
						/*for (int product : products) {
							if (product > max) {
								max = product;
							}
						}*/
						int index = 0;
						for(int i=0; i<products.length; i++) {
							Product product = products[i];
							if(product.getPrice() > max) {
								max = product.getPrice();
								index = i;
							}
						}

						int sum = 0;
						for(Product product : products) {
							if(product.getPrice() == max) {
								continue;
							}
							sum += product.getPrice();
						}
						//Product porudct = products[index];
						//System.out.println("최고 가격을 가진 제품은 " + porudct.getName() + "입니다.");
						System.out.println("최고 가격을 가진 제품은 " + products[index].getName() + "입니다.");
						
						
						System.out.println("최고 가격을 제외한 제품들의 합은 " + sum + "입니다.");
						break;
					case 5:
						run = false;
						System.out.println("프로그램 종료");
						break;
					}
				}

		

	}

}
