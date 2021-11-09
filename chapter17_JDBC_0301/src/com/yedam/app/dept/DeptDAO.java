package com.yedam.app.dept;

import java.util.List;

public interface DeptDAO {
	//전체조회
	List<Departments> selectAll();
	
	//단건조회
	Departments selectOne(int departmentId);
	
	//등록
	void insert(Departments dpet);
	
	//수정 : department_name
	void update(Departments dpet);
	
	//삭제
	void delete(int departmentId);
}
