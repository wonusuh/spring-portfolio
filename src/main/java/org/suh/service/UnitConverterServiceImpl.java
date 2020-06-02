/**
 * 
 */
package org.suh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.suh.domain.UnitConverterVO;
import org.suh.mapper.UnitConverterMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @author YONSAI
 *
 */
@Log4j
@Service
@AllArgsConstructor
public class UnitConverterServiceImpl implements UnitConverterService {

	// spring 4.3 이상에서 자동 처리
	@Setter(onMethod_ = @Autowired)
	private UnitConverterMapper mapper;

	@Override
	public void register(UnitConverterVO board) {
		// TODO Auto-generated method stub

		log.info("register........" + board);

		mapper.insertSelectKey(board);
	}

	@Override
	public UnitConverterVO get(int bno) {
		// TODO Auto-generated method stub

		log.info("get.........." + bno);

		return mapper.read(bno);
	}

	@Override
	public List<UnitConverterVO> getList() {
		// TODO Auto-generated method stub

		log.info("getList..........");

		return mapper.getList();
	}

	@Override
	public boolean remove(int bno) {

		log.info("remove.........." + bno);

		return mapper.delete(bno) == 1;
	}

}
