package org.zerok.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.zerok.board.vo.BoardVO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class BoardDAOImpl implements BoardDAO{

	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		log.info("list() - �Խ��� ����Ʈ ������ ��������+++++++++++");
		return null;
	}

	@Override
	public Long getTotalRow() throws Exception {
		// TODO Auto-generated method stub
		log.info("getTotalRow() - �Խ��� ��ü ������ ��������+++++++++++");
		return null;
	}

	@Override
	public BoardVO view() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Increase() throws Exception {
		// TODO Auto-generated method stub
		return 0;
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
