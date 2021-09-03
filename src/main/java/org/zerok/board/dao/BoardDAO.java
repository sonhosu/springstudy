package org.zerok.board.dao;

import java.util.List;

import org.zerok.board.vo.BoardVO;

public interface BoardDAO {
		// 1.����Ʈ
		public List<BoardVO> list() throws Exception;
		//1-1 ��ü �����Ͱ��� ��������
		public Long getTotalRow() throws Exception;
		
		// 2.�ۺ���
		public BoardVO view() throws Exception;

		//2-1. ��ȸ�� 1���� 
		public int Increase() throws Exception;
		
		// 3.�۾���
		public int write() throws Exception;

		// 4.�ۼ���
		public int update() throws Exception;

		// 5.�ۻ���
		public int delete() throws Exception;
}
