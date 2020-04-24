package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.ProdVO;
import org.zerock.mapper.ProdMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ProdServiceImpl implements ProdService {
	ProdMapper mapper;

	@Override
	public void register(ProdVO prod) {
		mapper.insert(prod);
	}

	@Override
	public List<ProdVO> getList() {
		return mapper.getList();
	}
	
	@Override
	public void modify(ProdVO prod) {
		mapper.modify(prod);
	}
	
	@Override
	public void delete(ProdVO prod) {
		mapper.delete(prod);
	}
}
