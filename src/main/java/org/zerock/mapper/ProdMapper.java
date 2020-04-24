package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ProdVO;

public interface ProdMapper {
	public void insert(ProdVO prod);
	public List<ProdVO> getList();
	public void modify(ProdVO prod);
	public void delete(ProdVO prod);
}
