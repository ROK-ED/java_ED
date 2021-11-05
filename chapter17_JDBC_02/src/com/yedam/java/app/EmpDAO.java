package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	// Oracle 연결정보
	private String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	private String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String connectedId = "hr";
	private String connectedPwd = "hr";

	// 각 메소드에서 공통적으로 사용하는 필드
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// DB 연결하기
	public void connect() {
		try {
			// 1. JDBC Driver 로딩하기
			Class.forName(jdbc_driver);

			// 2. DB 서버 접속하기

			Connection conn = DriverManager.getConnection(jdbc_url, connectedId, connectedPwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// 자원 해재하기
	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 조회 - 전체조회
	public List<Emp> selectAll() {
		// 값을 담을 변수 선언
		List<Emp> list = new ArrayList<Emp>();
		try {
			// DB연결하기
			connect();

			// SQL 실행과 결과 받아옴
			stmt = conn.createStatement();
			String select = "select * from employees order by employee_id";
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setMamberId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행시키기 위해 finally 구문 사용
			// 자원 및 DB 연결해제
			disconnect();
		}
		return list;
	}

	// 조회 - 단건조회 or 상세조회
	public Emp selectOne(int employeeId) {
		// 값을 담을 변수 선언
		Emp emp = new Emp();
		try {
			// DB연결하기
			connect();

			// SQL 실행과 결과 받아옴
			stmt = conn.createStatement();
			String select = "select * from employees where employee_id =" + employeeId;
			rs = stmt.executeQuery(select);
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setMamberId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행시키기 위해 finally 구문 사용
			// 자원 및 DB 연결해제
			disconnect();
		}
		return emp;
	}

	// 등록
	public void insert(Emp emp) {
		try {
			// DB 연결
			connect();
			
			

			String insert = "insert into employees values (?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setDate(6, emp.getHireDate());
			pstmt.setString(7, emp.getJobId());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommissionPct());
			pstmt.setInt(10, emp.getMamberId());
			pstmt.setInt(11, emp.getDepartmentId());

			// 4. SQL 실행
			int result = pstmt.executeUpdate();

			// 5. 결과값을 받아와서 출력하기
			System.out.println(result + "건이 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행시키기 위해 finally 구문 사용
			disconnect();
		}
	}
	// 수정
	//숙제

	// 삭제
	//숙제

}
