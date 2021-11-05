package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExamplee {

	   public static void main(String[] args) {

	      try {
	         // 1. JDBC Driver 로딩하기
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         // 2. DB 서버 접속하기
	         String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String id = "hr";
	         String password = "hr";
	         
	         Connection conn = DriverManager.getConnection(url, id, password);
	         /************************* INSERT *****************************/
	         
	         // 3. Statement or PreparedStatement 객체 생성하기
	         String insert = "insert into employees values (?,?,?,?,?,?,?,?,?,?,?)";
	         PreparedStatement pstmt = conn.prepareStatement(insert);
	         pstmt.setInt(1, 1000);
	         pstmt.setString(2, "kil-dong");
	         pstmt.setString(3, "Hong");
	         pstmt.setString(4, "kdhong@google.com");
	         pstmt.setString(5, "82.10.123.1234");
	         pstmt.setString(6, "21/11/05");
	         pstmt.setString(7, "SA_REP");
	         pstmt.setInt(8, 6000);
	         pstmt.setDouble(9, 0.15);
	         pstmt.setInt(10, 149);
	         pstmt.setInt(11, 80);
	         
	         // 4. SQL 실행
	         int result = pstmt.executeUpdate();

	         // 5. 결과값을 받아와서 출력하기
	         System.out.println("insert 결과 : " + result);
	         
	         /************************* UPDATE *****************************/
	         String update = "update employees set last_name = ? where employee_id = ?";
	         pstmt = conn.prepareStatement(update);
	         pstmt.setString(1, "Kang");
	         pstmt.setInt(2, 1000);
	         
	         result = pstmt.executeUpdate();
	         
	         System.out.println("update 결과 :" + result);
	         
	         /************************* SELECT *****************************/
	         Statement stmt = conn.createStatement();
	         String select = "select * from employees order by employee_id";
	         
	         ResultSet rs = stmt.executeQuery(select);
	         
	         while(rs.next()) {
	            String name = "이름 : " + rs.getString("first_name") 
	                                 + " " + rs.getString("last_name");
	            System.out.println(name);
	         }
	         
	         /************************* DELETE *****************************/
	         
	         String delete = "delete from employees where employee_id = ?";
	         pstmt = conn.prepareStatement(delete);
	         pstmt.setInt(1, 1000);
	         
	         result = pstmt.executeUpdate();
	         System.out.println("delete 결과 : " + result);
	         

	         // 6. 자원 해제하기
	         if(rs != null) rs.close();
	         if(stmt != null) stmt.close();
	         if(pstmt != null) pstmt.close();
	         if(conn != null) conn.close();
	      } catch (ClassNotFoundException | SQLException e) {
	         e.printStackTrace();
	      }
	   }

	}