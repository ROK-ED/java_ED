package com.yedam.app.product;

import java.util.List;

public interface ProductDAO {
	//입고기능
	public int insert(Product product);
	
	//출고기능
	public int update(int productId);
	
	//반품기능
	public int delete(int productId);
	
	//전체조회
	public List<Product> selectAll();
	
	//제품조회
	public Product selectOne(int productId);
	
	//구매요망제품조회
	public List<Product> selectInfo();
}
