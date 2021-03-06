package org.zerok.board.service;


import java.util.List;

import org.zerok.board.vo.BoardVO;

public interface BoardService {

	// 1.리스트
	public List<BoardVO> list() throws Exception;

	// 2.글보기
	public BoardVO view() throws Exception;

	// 3.글쓰기
	public int write() throws Exception;

	// 4.글수정
	public int update() throws Exception;

	// 5.글삭제
	public int delete() throws Exception;
}
