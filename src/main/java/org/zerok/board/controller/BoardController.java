package org.zerok.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerok.board.service.BoardService;


import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

///WEB-INF/spring/appServlet/servlet-context.xml �����ʿ�. componet-scan
@Controller
@RequestMapping("/board")
@Slf4j
public class BoardController {
	
	private final String MODULE = "board";
	
	//@Setter - lombok ���, @Autowired - Spring ���
		// ��� ��� ������ ������̼� : @Autowired = spring , @Inject =java
	@Setter(onMethod_ = @Autowired ) //== @Autowired
	private BoardService service;
	
	
	//�� ����Ʈ
	@GetMapping("/list.do")
	public String list() throws Exception {

		log.info("list() - �Խ��� ����Ʈ");
		
		service.list();
		
		return MODULE+ "/list";
	}
	//�� ����
	@GetMapping("/view.do")
	public String view() {

		log.info("list() - �Խ��� ����Ʈ");
		return "board/view";
	}

	// �۾��� ��
	@GetMapping("/write.do")
	public String writeform() {

		log.info("write() - �۾��� ��");
		return "board/write";
	}

	// �۾��� ó��
	@PostMapping("/write.do")
	public String write() {

		log.info("write() - �۾��� ó��");
		return "redirect:list.do";
	}

	// �ۼ��� ��
	@GetMapping("/update.do")
	public String updateform() {

		log.info("update() - �۾��� ��");
		return "board/update";
	}

	// �ۼ��� ó��
	@PostMapping("/update.do")
	public String update() {

		log.info("update() - �ۼ��� ó��");

		return "redirect:view.do";
	}
	//�� ����ó��
	@GetMapping("/delete.do")
	public String delete() {

		log.info("delete() - �ۻ��� ó��");

		return "redirect:list.do";
	}
}
