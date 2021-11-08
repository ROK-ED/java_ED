package com.yedam.app.dept;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class DeptDAOImpl extends DAO implements DeptDAO {
	//싱글톤
	private static DeptDAO instance = new DeptDAOImpl();
	
	public static DeptDAO getInstance() {
		return instance;
	}

	@Override
	public List<Departments> selectAll() {
		//전체조회
		List<Departments> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			String sql = "Select * From departments Order by department_id";//java에서는 sql 실행문 ;필요없음
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Departments dept = new Departments();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));
				
				list.add(dept);
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Departments selectOne(int departmentId) {
		//단건조회
		Departments dept = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select * from departments where department_id ="+departmentId;
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				
				dept= new Departments();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return dept;
	}

	@Override
	public void insert(Departments dept) {
		//등록
		
		try {
			connect();
			String sql = "insert into departments" + 
					" (department_id, department_name, manager_id, location_id)"+
					"valuse(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getManagerId());
			pstmt.setInt(4, dept.getLocationId());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건 등록완료");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void update(Departments dept) {
		//수정 : department_name
		try {
			connect();
			
			String sql = "update departments set department_name = ? where department_id =?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDepartmentName());
			pstmt.setInt(2, dept.getDepartmentId());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건 수정완료");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void delete(int departmentId) {
		//삭제
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "delete from departments where department_id = "+ departmentId;
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "건 삭제완료");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
