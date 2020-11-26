package com.yedam.board;

import java.util.List;
import java.util.Scanner;

import com.yedam.db2.EmployeeVO;

public class Boardmain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServicelempl();

		while (true) {
			System.out.println("-------------------------");
			System.out.println("1.전체조회 2.입력 3.삭제 4.종료");
			System.out.println("-------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				List list = service.getBoardList();
				for (Object vo : list) {
					BoardVo Bod = (BoardVo) vo;
					Bod.showBodInfo();
				}
			} else if (selectNo == 2) {

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {
				break;
			}

		}
             System.out.println("종료되었습니다.");
	}
}
