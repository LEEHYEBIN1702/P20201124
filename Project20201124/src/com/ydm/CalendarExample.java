package com.ydm;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		showCal(2020, 7);

		System.out.println();
		System.out.println();

//		Calendar cal = Calendar.getInstance();
//		cal.set(2020, 4, 1); // 2020년 5월 1일 //날짜 지정방법 //0부터 시작하니까 4라고 적어야 5월이 나옴
		// 월만 그럼
//		System.out.println("년도:" + cal.get(Calendar.YEAR));
//		System.out.println("월:" + cal.get(Calendar.MONTH));
//		System.out.println("날짜:" + cal.get(Calendar.DATE));
//		System.out.println("요일:" + cal.get(Calendar.DAY_OF_WEEK)); // 1일이 무슨 요일인지 숫자로 나타내줌
//		System.out.println("막날:" + cal.getActualMaximum(Calendar.DATE));

//		for (int i = 1; i < 31; i++) {
//			int sum = 0;
//			sum += i;
//			if (i % 7 == 0) {
//				System.out.printf("%3d", sum);
//				System.out.println();
//			} else {
//				System.out.printf("%3d", sum);
//			}

//		}

	}

	public static void showCal(int year, int month) {
		System.out.println("\t[" + year + "년" + month + "]");
		// 요일 정보 출력.
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		for (int j = 0; j < days.length; j++) {
			System.out.printf("%3s", days[j]);
		}
		System.out.println();
		int tMonth = month - 1; // 입력월과 캘린더 월 매칭.
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int Year = cal.get(Calendar.YEAR);
		int Month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int endday = cal.getActualMaximum(Calendar.DATE);
		int wEndDay = cal.get(Calendar.DAY_OF_WEEK);

//		System.out.println("day" + cal.get(Calendar.DATE));
//		System.out.println("wEndDay" + wEndDay);
//		System.out.println("endday" + endday);

		for (int i = 1; i <= endday; i++) {
			if (i < wEndDay) {
				System.out.printf("%3s", "★");
			}
			if (day == 1) {
				System.out.printf("%3s", i);
				System.out.println();
			}
			if (i % 7 == 0) {
				System.out.printf("%3s", i);
				System.out.println();
			}
		}

	}
}
