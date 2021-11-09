package com.yedam.app.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class ProductDAOImpl extends DAO implements ProductDAO {
	//사용할 SQL 정리
	private final String SELECT_ALL = "select * from baskinrobbins order by product_id";
	private final String SELECT_ONE = "select * from baskinrobbins where product_id = ?";
	private final String SELECT_INFO = "select * from baskinrobbins where now_value<= ? or (input_date + ? ) <= sysdate order by product_id";
	private final String INSERT = "insert into baskinrobbins values(?,?,?,?,?)";
	private final String UPDATE = "update baskinrobbins set now_value = now_value - ? where product_id = ?";
	private final String DELETE = "delete from baskinrobbins where product_id = ?";
	
	//기준이 되는 값
	private final int OUT_VALUE = 20; //한번 판매 시 출고수량
	private final int VALUE_STANDARD = 100; //구매요망조회 시 현재 수량 기준
	private final int PERIOD_STANDARD = 15; //구매요망조회 시 입고 후 기간
	
	//싱글톤
	
	private static ProductDAO instance = new ProductDAOImpl();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	@Override
	public int insert(Product product) {
		// 등록
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setInt(3, product.getInputValue());
			pstmt.setInt(4, product.getInputValue());
			pstmt.setDate(5, product.getInputDate());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int update(int productId) {
		// 수정
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setInt(1, OUT_VALUE);
			pstmt.setInt(2, productId);
			
			result = pstmt.executeUpdate();			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int delete(int productId) {
		// 삭제
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, productId);
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

	@Override
	public List<Product> selectAll() {
		// 전체제품조회
		List<Product> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while(rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setInputValue(rs.getInt("input_value"));
				product.setNowValue(rs.getInt("now_value"));
				product.setInputDate(rs.getDate("input_date"));
				
				list.add(product);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Product selectOne(int productId) {
		// 제품조회
		Product product = null;
		try {
			connect();
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, productId);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setInputValue(rs.getInt("input_value"));
				product.setNowValue(rs.getInt("now_value"));
				product.setInputDate(rs.getDate("input_date"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return product;
	}

	@Override
	public List<Product> selectInfo() {
		// 두 가지 조건 중 하나라도 만족하는 제품 목록
		List<Product> list = new ArrayList<>();
		try {
			connect();
			
			pstmt = conn.prepareStatement(SELECT_INFO);
			pstmt.setInt(1, VALUE_STANDARD);
			pstmt.setInt(2, PERIOD_STANDARD);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setInputValue(rs.getInt("input_value"));
				product.setNowValue(rs.getInt("now_value"));
				product.setInputDate(rs.getDate("input_date"));
				
				list.add(product);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

}
