package com.ds.mapper;

import java.util.List;

import com.ds.domain.BoardVO;

public interface BoardMapper {
	public void insert(BoardVO vo);
	public int update(BoardVO vo);
	public int delete(Long bno);
	public BoardVO read(Long bno);
	public List<BoardVO> getList();
}
