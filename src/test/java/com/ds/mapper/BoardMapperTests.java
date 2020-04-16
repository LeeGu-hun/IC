package com.ds.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ds.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	
	@Test
	public void testInsert() {
		BoardVO b = new BoardVO();
		b.setTitle("제목작성");
		b.setContent("내용작성");
		b.setWriter("user");
		mapper.insert(b);
	}
	@Test
	public void testRead() {
		BoardVO b = mapper.read(37L);
		log.info(b);
	}
	
}
