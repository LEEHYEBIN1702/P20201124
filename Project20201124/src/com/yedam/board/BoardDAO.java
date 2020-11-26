package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	BoardVo vo = new BoardVo();

	// 전체 조회
	public List getBoardList() {
		conn = DAO.getConnection();
		sql = "select * from board";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVo vo = new BoardVo();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationDate(rs.getString("creation_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
//한건 조회
	public BoardVo getBod(int boardNo) {
		conn = DAO.getConnection();
		 sql = "select * from board where board_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationDate(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;

	}
//한건 입력
	public void insertBod(BoardVo boardVo) {
		conn = DAO.getConnection();
		String sql = "insert into board(board_no, title, content, writer, creation_date) values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardVo.getBoardNo());
			pstmt.setString(2, boardVo.getTitle());
			pstmt.setString(3, boardVo.getContent());
			pstmt.setString(4, boardVo.getWriter());
			pstmt.setString(5, boardVo.getCreationDate());

			int r = pstmt.executeUpdate();

			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//한건 수정
	public void updateBod(BoardVo boardVo) {
		conn = DAO.getConnection();
		 sql = "update board "
				+ "set board_no = nvl(" + boardVo.getBoardNo() + ", board_no)" 
				+ ", title = nvl("+ boardVo.getTitle() + ", title)"
		                + ", content = nvl(" + boardVo.getContent() + ", content)"
		                + ", writer = nvl(" + boardVo.getWriter() + ", writer)"
				+ ", creation_date = nvl(" + boardVo.getCreationDate() + ", creation_date)" 
		                + "where board_no = " + boardVo.getBoardNo();

		try { 
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	//한건 삭제
	public void deleteBod(int boardNo) {
		String sql = "delete from board where board_no  = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();

			System.out.println(rs + "건 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
