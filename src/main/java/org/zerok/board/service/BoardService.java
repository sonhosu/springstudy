package org.zerok.board.service;


import java.util.List;

import org.zerok.board.vo.BoardVO;

public interface BoardService {

	// 1.����Ʈ
	public List<BoardVO> list() throws Exception;

	// 2.�ۺ���
	public BoardVO view() throws Exception;

	// 3.�۾���
	public int write() throws Exception;

	// 4.�ۼ���
	public int update() throws Exception;

	// 5.�ۻ���
	public int delete() throws Exception;
}
