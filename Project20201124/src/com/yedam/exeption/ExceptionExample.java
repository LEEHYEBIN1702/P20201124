package com.yedam.exeption;

import java.sql.Connection;
import java.sql.SQLException;

import com.yedam.common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {

		int num = 20;

		try {
			int[] numbers = new int[3]; // 배열 갯수 3개
			numbers[3] = 10; // 배열 위치에다 10을 담는다.
		} catch (Exception e) {
//			System.out.println("에러발생.");
//        	e.printStackTrace();
		}
		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("출력 값이 없습니다.");
		}
		 
//		 Connection conn = DAO.getConnection();
//		 try {
//			conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		 System.out.println("프로그램 종료");
	}
}