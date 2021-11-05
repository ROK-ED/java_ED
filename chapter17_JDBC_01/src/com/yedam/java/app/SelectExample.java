package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.JDBC Driver 로딩하기.
		Class.forName("oracle.jdbc.driver.OracleDriver");//()안에 이름을 기입하면 반환해줌
		
		//2.DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "hr";
		
		Connection conn = DriverManager.getConnection(url, id, password);
		
		//3. Statement 완성된 문장을 한번에 넣어야 한다 ,까지 상세하게 해야됨
		//or PreparedStatement 문장을 넣으면 정리가 자동을 된다
		//객체 생성하기
		Statement stmt = conn.createStatement();
		
		//String sql = "insert into employees values(\'"+str1+","+str2+"...)";
		//4. SQL 실행 ~결과값을 받아오는 클래스
		ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
		
		//5. 결과값 받아서 출력하기
		while(rs.next()) {
			String name = "이름 : "+ rs.getString("First_name");
			System.out.println(name);
		}
		//6. 자원 해제 하기 ~ 실행 역순으로 전부 해제해줘야 한다
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
		
		

	}

}
