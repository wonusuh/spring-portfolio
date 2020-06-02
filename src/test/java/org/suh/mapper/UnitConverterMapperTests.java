/**
 * 
 */
package org.suh.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.suh.domain.UnitConverterVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @author YONSAI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UnitConverterMapperTests {
	@Setter(onMethod_ = @Autowired)
	private UnitConverterMapper mapper;

	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}

	@Test
	public void testInsert() {
		UnitConverterVO board = new UnitConverterVO();
		board.setFromunit(942);
		board.setExpression("test expression");
		board.setTounit(1020);
		mapper.insert(board);
		log.info(board);
	}

	@Test
	public void testSelectKey() {
		UnitConverterVO board = new UnitConverterVO();
		board.setFromunit(1022);
		board.setExpression("test expression select key");
		board.setTounit(1023);
		mapper.insertSelectKey(board);
		log.info(board);
	}

	@Test
	public void testRead() {
		// 존재하는 게시물 번호로 테스트
		UnitConverterVO board = mapper.read(22);
		log.info(board);
	}

	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete(20));
	}
}
