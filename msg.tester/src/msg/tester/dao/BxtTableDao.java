package msg.tester.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import msg.tester.domain.BxtTableDto;

public interface BxtTableDao {

	public List<BxtTableDto> selectAll();

	public int insert(BxtTableDto dto);

	public int update(BxtTableDto dto);

	public int delete(@Param("col1") String col1);
}
