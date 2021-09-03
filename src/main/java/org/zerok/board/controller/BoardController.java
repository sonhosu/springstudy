package org.zerok.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerok.board.service.BoardService;


import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

///WEB-INF/spring/appServlet/servlet-context.xml 설정필요. componet-scan
@Controller
@RequestMapping("/board")
@Slf4j
public class BoardController {
	
	private final String MODULE = "board";
	
	//@Setter - lombok 사용, @Autowired - Spring 사용
		// 대신 사용 가능한 어노테이션 : @Autowired = spring , @Inject =java
	@Setter(onMethod_ = @Autowired ) //== @Autowired
	private BoardService service;
	
	
	//글 리스트
	@GetMapping("/list.do")
	public String list() throws Exception {

		log.info("list() - 게시판 리스트");
		
		service.list();
		
		return MODULE+ "/list";
	}
	//글 보기
	@GetMapping("/view.do")
	public String view() {

		log.info("list() - 게시판 리스트");
		return "board/view";
	}

	// 글쓰기 폼
	@GetMapping("/write.do")
	public String writeform() {

		log.info("write() - 글쓰기 폼");
		return "board/write";
	}

	// 글쓰기 처리
	@PostMapping("/write.do")
	public String write() {

		log.info("write() - 글쓰기 처리");
		return "redirect:list.do";
	}

	// 글수정 폼
	@GetMapping("/update.do")
	public String updateform() {

		log.info("update() - 글쓰기 폼");
		return "board/update";
	}

	// 글수정 처리
	@PostMapping("/update.do")
	public String update() {

		log.info("update() - 글수정 처리");

		return "redirect:view.do";
	}
	//글 삭제처리
	@GetMapping("/delete.do")
	public String delete() {

		log.info("delete() - 글삭제 처리");

		return "redirect:list.do";
	}
}
