/**
 * 
 */
package org.suh.service;

import java.util.List;

import org.suh.domain.UnitConverterVO;

/**
 * @author YONSAI
 *
 */
public interface UnitConverterService {

	public void register(UnitConverterVO board);

	public UnitConverterVO get(int bno);

	public boolean remove(int bno);

	public List<UnitConverterVO> getList();

}
