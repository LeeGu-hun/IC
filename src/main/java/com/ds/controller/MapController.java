package com.ds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/map/*")
public class MapController {
	
	@GetMapping("/usermap")
	public void usermap() {
		log.info("usermap");
	}
	
	@GetMapping("/test")
	public void test() {
		log.info("test");
	}
}
