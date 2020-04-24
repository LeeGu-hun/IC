package org.zerock.domain;

import lombok.Data;

@Data
public class ProdVO {
	private String pnum, pname;
	private int price, quantity, snum;
}
