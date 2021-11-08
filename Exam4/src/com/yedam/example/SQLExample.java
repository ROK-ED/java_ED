package com.yedam.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {

	public static void main(String[] args) {

		try {// SQL 오류를 대비하여 먼저 예외처리 하고 시작할것
				// 1. JDBC Driver 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 서버 접속하기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String password = "hr";

			Connection conn = DriverManager.getConnection(url, id, password);

			// 중복사용
			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int result = 0;
			stmt = conn.createStatement();

			// 1번

			String q1 = "SELECT * FROM employees WHERE salary BETWEEN 5000 AND 10000";

			rs = stmt.executeQuery(q1);
			System.out.println("==급여가 5000에서 10000사이인 사원목록==");
			while (rs.next()) {

				String a = "사원번호 : " + rs.getInt("employee_id") + ", 이름:" + rs.getString("first_name") + ", 이메일 : "
						+ rs.getString("email") + ", 급여 : " + rs.getInt("salary");
				System.out.println(a);

			}

			// 2번
			System.out.println();
			String q2 = "SELECT MAX(salary) FROM employees WHERE  job_id = 'ST_CLERK'";

			rs = stmt.executeQuery(q2);
			while (rs.next()) {
				String a = "== 직책이 'ST_CLERK' 인 사원 중 최고 연봉 : " + rs.getInt("MAX(salary)");
				System.out.println(a);
			}

			// 3번
			System.out.println();
			String q3 = "SELECT AVG(salary) FROM employees WHERE  TO_CHAR(hire_date, 'MM') = '05' ";
			rs = stmt.executeQuery(q3);

			while (rs.next()) {
				String a = "== 5월에 입사한 사원들의 평균 연봉 : " + rs.getInt("AVG(salary)");
				System.out.println(a);
			}

			// 4번
			System.out.println();
			String q4 = "SELECT * FROM employees WHERE  job_id = 'SA_REP' AND salary > 10000";
			rs = stmt.executeQuery(q4);

			System.out.println("== 직책이 : 'SA_REP' 이며 급여가 10000이상인 사원 목록 ==");
			while (rs.next()) {
				String b = "사원번호 : " + rs.getInt("employee_id") + ", 이름:" + rs.getString("first_name") + ", 이메일 : "
						+ rs.getString("email") + ", 급여 : " + rs.getInt("salary");
				System.out.println(b);
			}

			// DB 해제

			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
