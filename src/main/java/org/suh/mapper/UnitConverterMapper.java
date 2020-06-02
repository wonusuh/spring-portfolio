/**
 * 
 */
package org.suh.mapper;

import java.util.List;
//import org.apache.ibatis.annotations.Select;
import org.suh.domain.UnitConverterVO;

/**
 * @author YONSAI
 *
 */
public interface UnitConverterMapper {
//	@Select("select * from newtable where bno > 0")
	public List<UnitConverterVO> getList();

	public void insert(UnitConverterVO board);

	public void insertSelectKey(UnitConverterVO board);

	public UnitConverterVO read(int bno);

	public int delete(int bno);
}
