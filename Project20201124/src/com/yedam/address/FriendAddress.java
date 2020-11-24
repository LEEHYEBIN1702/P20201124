package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 주소록 생성 프로그램...
	public static void main(String[] args) {

		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.검색 6.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();

			} else if (selectNo == 3) {
				addCompFriend();

			} else if (selectNo == 4) {
				showFrienList();

			} else if (selectNo == 5) {
			
				searchName();

			} else if (selectNo == 6) {
				break;
			}

		}

	} // end of main()
		// 1.친구등록

	public static void addFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
		insertFriend(frnd);
		//for (int i = 0; i < friends.length; i++) {
			//if (friends[i] == null) {
				//friends[i] = frnd; // 브레이크 안 적으면 new Friend[100]에 배열수 100번만큼 돌면서 i에 frnd를 넣음
									// 한번 넣고 빠져나올 수 있도록 브레이크 걸어주기.
			}
	//	}
	//}

	// 2. 학교친구
	public static void addUnivFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("학교이름: ");
		String univ = scn.nextLine();
		System.out.println("전공정보: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFriend(frnd);
		//for (int i = 0; i < friends.length; i++) {
		//	if (friends[i] == null) {
		//		friends[i] = frnd; // 브레이크 안 적으면 new Friend[100]에 배열수 100번만큼 돌면서 i에 frnd를 넣음
			} // 한번 넣고 빠져나올 수 있도록 브레이크 걸어주기.
	//	}
	//}

	// 3. 회사친구

	public static void addCompFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("회사이름: ");
		String univ = scn.nextLine();
		System.out.println("부서정보: ");
		String major = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(univ);
		frnd.setDepartment(major);
		insertFriend(frnd);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = frnd; // 브레이크 안 적으면 new Friend[100]에 배열수 100번만큼 돌면서 i에 frnd를 넣음
									// 한번 넣고 빠져나올 수 있도록 브레이크 걸어주기.
		
			}
//		}
//	}

	// 4. 리스트
	public static void showFrienList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo(); // 널이 아닌 경우에 쇼인포에 값을 넣어줌.
			}
		}
	}

	// 5. 찾기
	public static void searchName() {
		System.out.println("찾을 이름 입력> ");
		String searchName = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && searchName.equals(friends[i].getName())) {
				friends[i].showFriendInfo();
			}
		}

	}

	// 7.한건 입력
	public static void insertFriend(Friend Friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = Friend;
				break;
			}
		}

	}

}// end of class.