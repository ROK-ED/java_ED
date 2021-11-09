package record;

import java.util.List;

public interface RecordDAO {
	// 전체기록확인
	public List<Record> recordSelectAll();

	// 단일기록확인
	public Record recordSelect(int recordPlayerId);

	// 등록
	public int recordInsert(Record record);

	// 삭제
	void recordDelete(int recordPlayerId);

}
