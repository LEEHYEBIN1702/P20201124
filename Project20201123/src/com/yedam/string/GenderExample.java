package com.yedam.string;

public class GenderExample {
	public static void main(String[] args) {

		String birth1 = "991123-1234567";
		String birth2 = "991122-2345678";
		String birth3 = "010101*3456789";
		String birth4 = "0202024211234";
		String[] birth = { birth1, birth2, birth3, birth4 };

		for (int i = 0; i < 4; i++) {
			String temp = birth[i].replace("-", "");
			temp = birth[i].replace("*", "");

			char sex = birth[i].charAt(7);
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;

			}
		}
	}
}