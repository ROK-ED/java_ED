package com.app.data.acct;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.common.DAO;
import com.app.data.record.Record;
import com.app.data.record.RecordDAO;
import com.app.data.record.RecordDAOImpl;

public class AcctDAOImpl extends DAO implements AcctDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from acct order by acctid";
	private final String SELECT_ONE = "select * from acct where acctid = ?";
	private final String INSERT = "insert into acct values(?,?)";
	private final String DELETE = "delete from acct where acctid = ?";

	// 싱글톤
	private static AcctDAO instance = new AcctDAOImpl();

	public static AcctDAO getInstance() {
		return instance;
	}

	@Override
	public List<Acct> acctSelectAll() {
		// 전체계정확인
		List<Acct> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Acct acct = new Acct();
				acct.setAcctId(rs.getString("acctid"));
				acct.setAcctPw(rs.getString("acctpw"));

				list.add(acct);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Acct acctSelect(String acctid) {
		// 계정확인
		Acct acct = null;
		try {
			connect();

			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setString(1, acctid);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				acct = new Acct();
				acct.setAcctId(rs.getString("acctid"));
				acct.setAcctPw(rs.getString("acctpw"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return acct;
	}

	@Override
	public void acctInsert(Acct acct) {
		// 등록
		try {
			connect();

			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, acct.getAcctId());
			pstmt.setString(2, acct.getAcctPw());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건 등록완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void acctDelete(String acctid) {
		// 삭제
		Acct acct = null;
		try {
			connect();
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, acctid);
			int result = pstmt.executeUpdate();
			System.out.println(result + "건 삭제완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
}
