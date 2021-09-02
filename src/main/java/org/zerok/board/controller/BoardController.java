package org.zerok.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

///WEB-INF/spring/appServlet/servlet-context.xml �����ʿ�. componet-scan
@Controller
@RequestMapping("/board")
@Slf4j
public class BoardController {

	
	@GetMapping("/list.do")
	public String list() {
		
		log.info("list() - �Խ��� ����Ʈ");
		return "board/list";
	}
	
	//�۾��� ��
	@GetMapping("/write.do")
	public String writeform() {
		
		log.info("write() - �۾��� ��");
		return "board/write";
	}
	
	//�۾��� ó��
	@PostMapping("/write.do")
	public String write() {
		
		log.info("write() - �۾��� ó��");
		return "redirect:list.do";
	}
}
