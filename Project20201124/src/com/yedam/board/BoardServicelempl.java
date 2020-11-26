package com.yedam.board;

import java.util.List;


public class BoardServicelempl implements BoardService {
	
	BoardDAO dao = new BoardDAO();

	@Override
	public List getBoardList() {
		// TODO Auto-generated method stub
		return dao.getBoardList();
	}

	@Override
	public BoardVo getBod(int boardNo) {
		// TODO Auto-generated method stub
		return dao.getBod(boardNo);
	}

	@Override
	public void insertBod(BoardVo boardVo) {
		// TODO Auto-generated method stub
		dao.insertBod(boardVo);
	}

	@Override
	public void updateBod(BoardVo boardVo) {
		// TODO Auto-generated method stub
		dao.updateBod(boardVo);
	}

	@Override
	public void deleteBod(int boardNo) {
		// TODO Auto-generated method stub
		dao.deleteBod(boardNo);
	}

	
}