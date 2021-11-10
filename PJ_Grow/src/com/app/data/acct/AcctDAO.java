package com.app.data.acct;

import java.util.List;

public interface AcctDAO {

	// 전체계정확인
	public List<Acct> acctSelectAll();

	// 계정확인
	public Acct acctSelect(String acctid);

	// 등록
	public void acctInsert(Acct acct);

	// 삭제
	public void acctDelete(String acctid);

}
