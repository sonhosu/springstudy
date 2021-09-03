package org.zerok.board.dao;

import java.util.List;

import org.zerok.board.vo.BoardVO;

public interface BoardDAO {
		// 1.리스트
		public List<BoardVO> list() throws Exception;
		//1-1 전체 데이터갯수 가져오기
		public Long getTotalRow() throws Exception;
		
		// 2.글보기
		public BoardVO view() throws Exception;

		//2-1. 조회수 1증가 
		public int Increase() throws Exception;
		
		// 3.글쓰기
		public int write() throws Exception;

		// 4.글수정
		public int update() throws Exception;

		// 5.글삭제
		public int delete() throws Exception;
}
