package com.ds.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.domain.BoardVO;
import com.ds.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;
	private int var = 1;
	@Override
	public void register(BoardVO board) {
		log.info("register........");
		mapper.insert(board);;
	}
	@Override
	public List<BoardVO> getList() {
		log.info("getList...........");
		return mapper.getList();
	}
	@Override
	public BoardVO get(Long bno) {
		log.info("get.............");
		return mapper.read(bno);
	}
	@Override
	public boolean modify(BoardVO board) {
		log.info("modify............."+board);
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("remove............."+bno);
		return mapper.delete(bno)==1;
	}



}
