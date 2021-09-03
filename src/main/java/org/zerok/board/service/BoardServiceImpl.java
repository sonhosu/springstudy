package org.zerok.board.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;
import org.zerok.board.dao.BoardDAO;
import org.zerok.board.vo.BoardVO;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService {
//@Setter - lombok 사용, @Autowired - spring 사용
//대신 사용 가능한 어노테이션  : @Autowired - Spring, @Inject - java
//DI 적용시 BoardService 타입 : 1. BoardService 인터페이스 2. BoardServiceImpl 클래스
	
	private BoardDAO dao;
	
	
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		
		log.info("list() - 게시판 리스트 서비스 실행");
		
		dao.getTotalRow();
		
		dao.list();
		return null;
	}

	@Override
	public BoardVO view() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int write() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
