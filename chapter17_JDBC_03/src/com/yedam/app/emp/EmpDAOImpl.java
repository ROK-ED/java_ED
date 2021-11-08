package com.yedam.app.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
	// 싱글톤
	private static EmpDAO instance = new EmpDAOImpl();

	public static EmpDAO getInstance() {
		return instance;
	}

	@Override
	public List<Emp> selectAll() {
		// 전체조회
		List<Emp> list = new ArrayList<>();
		try {
			connect();

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
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Emp selectOne(int employeeId) {
		// 단건조회
		Emp emp = null;
		try {
			connect();

			stmt = conn.createStatement();
			String select = "select * from employees where employee_id = " + employeeId;
			rs = stmt.executeQuery(select);
			if (rs.next()) {
				emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

			}
		} catch (SQLException | NullPointerException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	@Override
	public void insert(Emp emp) {
		// 등록
		try {
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
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartmentId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void update(Emp emp) {
		// 수정 : last_name
		try {
			connect();

			String update = "update employees set last_name = ? where employee_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, emp.getLastName());
			pstmt.setInt(2, emp.getEmployeeId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int employeeId) {
		// 삭제
		try {
			connect();

			String delete = "delete from employees where employee_id = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employeeId);

			int result = pstmt.executeUpdate();
			System.out.println( result + "건이 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}
