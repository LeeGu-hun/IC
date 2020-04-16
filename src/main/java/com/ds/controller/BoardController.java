package com.ds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ds.domain.BoardVO;
import com.ds.service.BoardService;

import lombok.Setter;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@GetMapping("/register")
	public void registerForm() {
		
	}
	@PostMapping("/register")
	public void registerSubmit(BoardVO b, RedirectAttributes rttr) {
		
		service.register(b);
		rttr.addFlashAttribute("result", b.getBno());
	}
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno, 
			 Model model) {
		//log.info("get");
		model.addAttribute("board", service.get(bno));
	}
	
}
