package com.Morning1127;

import java.util.Scanner;

public class arrayorderby1127 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 입력값: ");
		int first = scn.nextInt();
		scn.nextLine();
		System.out.println("두번째 입력값: ");
		int second = scn.nextInt();
		scn.nextLine();
		System.out.println("세번째 입력값: ");
		int third = scn.nextInt();
		scn.nextLine();
		int temp = 0;
		int[] scores = { first, second, third };

		for (int i = 0; i < scores.length; i++) {
			for (int num : scores) {
				if (temp < num) {
					temp = num;
					
				}
			}
		}
	}
}