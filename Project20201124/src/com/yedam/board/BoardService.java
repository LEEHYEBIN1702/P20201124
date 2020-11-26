package com.yedam.board;

import java.util.List;



public interface BoardService {
	public List getBoardList();//리스트 조회
	public BoardVo getBod(int boardNo);//한건조회
	public void insertBod(BoardVo boardVo);//입력
	public void updateBod(BoardVo boardVo);//수정
	public void deleteBod(int boardNo);//삭제
	
}
