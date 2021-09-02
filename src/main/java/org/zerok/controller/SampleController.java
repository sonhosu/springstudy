package org.zerok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.extern.slf4j.Slf4j;



///WEB-INF/spring/appServlet/servlet-context.xml 설정필요. componet-scan
@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {

	//실행할 메서드
	@RequestMapping("")
	public void basic() {
		log.info("basic---------");
	}
}
