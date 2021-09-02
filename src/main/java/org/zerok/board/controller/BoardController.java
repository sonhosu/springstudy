package org.zerok.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

///WEB-INF/spring/appServlet/servlet-context.xml 설정필요. componet-scan
@Controller
@RequestMapping("/board")
@Slf4j
public class BoardController {

	
	@GetMapping("/list.do")
	public String list() {
		
		log.info("list() - 게시판 리스트");
		return "board/list";
	}
	
	//글쓰기 폼
	@GetMapping("/write.do")
	public String writeform() {
		
		log.info("write() - 글쓰기 폼");
		return "board/write";
	}
	
	//글쓰기 처리
	@PostMapping("/write.do")
	public String write() {
		
		log.info("write() - 글쓰기 처리");
		return "redirect:list.do";
	}
}
