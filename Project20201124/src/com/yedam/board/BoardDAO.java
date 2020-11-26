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

	public void insertBod(BoardVo boardVo) {
		conn = DAO.getConnection();
		BoardVo vo = new BoardVo();
		String sql = "insert into board (board_no, title, content, writer, creation_date) values (?,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardNo());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
			pstmt.setString(5, vo.getCreationDate());

			int r = pstmt.executeUpdate();

			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
