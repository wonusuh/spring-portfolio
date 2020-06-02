/**
 * 
 */
package org.suh.service;

import static org.junit.Assert.assertNotNull;

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
public class UnitConverterServiceTests {

	@Setter(onMethod_ = { @Autowired })
	private UnitConverterService service;

	@Test
	public void testExist() {

		log.info(service);
		assertNotNull(service);
	}

	@Test
	public void testRegister() {

		UnitConverterVO board = new UnitConverterVO();
		board.setFromunit(1048);
		board.setExpression("test service expression");
		board.setTounit(1049);

		service.register(board);

		log.info("생성 된 게시물의 번호 : " + board.getBno());
	}

	@Test
	public void testGetList() {

		service.getList().forEach(board -> log.info(board));
	}

	@Test
	public void testGet() {

		log.info(service.get(1));
	}

	@Test
	public void testDelete() {

		// 게시물 번호를 확인하고 테스트할 것
		log.info("REMOVE RESULT : " + service.remove(20));
	}

}
