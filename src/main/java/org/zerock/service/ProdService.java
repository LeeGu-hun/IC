package org.zerock.service;

import java.util.List;

import org.zerock.domain.ProdVO;

public interface ProdService {
	public void register(ProdVO prod); // 등록
	public List<ProdVO> getList(); // 조회
	public void modify(ProdVO prod);
	public void delete(ProdVO prod);
}
