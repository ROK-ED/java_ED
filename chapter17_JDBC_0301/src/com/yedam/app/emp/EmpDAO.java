package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
	//전체조회
	List<Emp> selectAll();
	
	//단건조회
	Emp selectOne(int employeeId);
	
	//등록
	void insert(Emp emp);
	
	//수정 : last_name
	void update(Emp emp);
	
	//삭제
	void delete(int employeeId);
}
