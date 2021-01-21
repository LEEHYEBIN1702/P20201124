package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class Boardmain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServicelempl();

		while (true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.전체조회 2.한건조회 3.입력 4.수정 5.삭제 6.종료");
			System.out.println("-----------------------------------------------------------");
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
				System.out.println("조회할 번호 입력: ");
				int boardNo = scn.nextInt();
				BoardVo vo = service.getBod(boardNo);
				vo.showBodInfo();

			} else if (selectNo == 3) {
				System.out.println("boardNo를 입력하세요.");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("title을 입력하세요.");
				String title = scn.nextLine();
				System.out.println("content 를 입력하세요");
				String content = scn.nextLine();
				System.out.println("writer를 입력하세요");
				String writer = scn.nextLine();
//				System.out.println("creationDate를 입력하세요");
//				String creationDate = scn.nextLine();

				BoardVo Bod = new BoardVo();
				Bod.setBoardNo(boardNo);
				Bod.setTitle(title);
				Bod.setContent(content);
				Bod.setWriter(writer);
//				Bod.setCreationDate(creationDate);

				service.insertBod(Bod);

			} else if (selectNo == 4) {
     			System.out.println("수정할 boardNo: ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 title: ");
				String title = scn.nextLine();
				System.out.println("수정할 Content: ");
				String content = scn.nextLine();
				System.out.println("수정할 writer: ");
				String writer = scn.nextLine();
				System.out.println("수정할 creationDate: ");
				String creationDate = scn.nextLine();

				BoardVo Bod = new BoardVo();
				Bod.setBoardNo(boardNo);
				Bod.setTitle(title);
				Bod.setContent(content);
				Bod.setWriter(writer);
				Bod.setCreationDate(creationDate);

				service.updateBod(Bod);

			} else if (selectNo == 5) {
				System.out.println("삭제할 번호 입력: ");
				int boardNo = scn.nextInt();
				service.deleteBod(boardNo);

			} else if (selectNo == 6) {
				break;
			}

		}
		System.out.println("종료되었습니다.");
	}
}
