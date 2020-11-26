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
	public void insertBod(BoardVo boardVo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBod(int boardNo) {
		// TODO Auto-generated method stub
		
	}
	
}