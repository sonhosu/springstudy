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
//@Setter - lombok ���, @Autowired - spring ���
//��� ��� ������ ������̼�  : @Autowired - Spring, @Inject - java
//DI ����� BoardService Ÿ�� : 1. BoardService �������̽� 2. BoardServiceImpl Ŭ����
	
	private BoardDAO dao;
	
	
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		
		log.info("list() - �Խ��� ����Ʈ ���� ����");
		
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
