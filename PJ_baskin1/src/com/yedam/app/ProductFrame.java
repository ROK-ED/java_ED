package com.yedam.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.yedam.app.product.Product;
import com.yedam.app.product.ProductDAO;
import com.yedam.app.product.ProductDAOImpl;

public class ProductFrame {
	// ==필드
	Scanner scanner = new Scanner(System.in);
	ProductDAO dao = ProductDAOImpl.getInstance();
	
	// ==생성자
	public ProductFrame() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록
				insert();
			} else if (menuNo == 2) { // 수정
				update();
			} else if (menuNo == 3) { // 삭제
				delete();
			} else if (menuNo == 4) { // 단건조회
				selectOne();
			} else if (menuNo == 5) { // 전체조회
				selectAll();
			} else if (menuNo == 6) { // 구매요망조회
				selectInfo();
			}else if (menuNo == 9) { // 종료
				end();
				break;
			}
		}
	}
	// ==메소드
	// 메뉴를 출력하는 메소드
		void menuPrint() {
			System.out.println("");
			System.out.println("=========================================================");
			System.out.println("==1.입고 2.출고 3.반품 4.제품조회 5.전체조회 6.구매요망조회 9.종료==");
			System.out.println("=========================================================");
			System.out.println("선택>>");
		}

		// 메뉴를 선택하는 메소드
		int menuSelect() {
			int menuNo = 0;
			try {
				menuNo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("없는 메뉴입니다.");
			}
			return menuNo;
		}
		
		// 제품번호 입력
		int inputProductId() {
			System.out.println("제품번호 >>");
			return scanner.nextInt();
		}
	
		// 입고기능
		void insert() {
			Product product = new Product();
			System.out.println("제품번호 >>");
			product.setProductId(scanner.nextInt());
			
			if(isOnTheList(product.getProductId())) {
				System.out.println("등록된 제품이 존재합니다.");
				return;
			}
			
			System.out.println("제품명 >>");
			product.setProductName(scanner.next());
			
			System.out.println("입고수량 >>");
			product.setInputValue(scanner.nextInt());
			
			System.out.println("입고일자 >>");
			product.setInputDate(Date.valueOf(scanner.next()));
			
			int result = dao.insert(product);
			System.out.println(result + "건이 입고되었습니다.");
		}
		
		// 등록여부
		boolean isOnTheList(int productId) {
			Product selectedProduct = dao.selectOne(productId);
			if(selectedProduct == null) {
				return false;
			}else {
				return true;
			}
		}
		
		// 출고기능
		void update() {
			int selected = inputProductId();
			int result = dao.update(selected);
			System.out.println(result + "건이 출고되었습니다.");
			
			Product selectedProduct = dao.selectOne(selected);
			System.out.println("해당 제품의 남은 수량이 " 
							+ selectedProduct.getNowValue() + " 입니다." );
		}
		
		// 반품기능
		void delete() {
			int selected = inputProductId();
			int result = dao.delete(selected);
			System.out.println(result + "건이 반품되었습니다.");
		}
		
		// 전체 제품 조회
		void selectAll() {
			List<Product> list = dao.selectAll();
			for(Product product : list) {
				System.out.println(product);
			}
		}
		
		// 제품 조회
		void selectOne() {
			int selected = inputProductId();
			Product product = dao.selectOne(selected);
			System.out.println(product);
		}
		
		// 구매요망조회
		void selectInfo() {
			List<Product> list = dao.selectInfo();
			for(Product product : list) {
				System.out.println(product);
			}
		}
		
		// 종료
		void end() {
			System.out.println("프로그램을 종료합니다.");
		}
}
