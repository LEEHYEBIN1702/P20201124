package com.yedam.abstracts;

public class PhoneExample {
	public static void main(String[] args) {
 //      new Phone();
 //      new Phone("Hong"); //new 달고 새로 직접인스턴스 못 만드는 게 추상 클래스
	Phone phone = new SmartPhone(); // 상속 받는 식으로 가져옴 
	phone.owner = "Hong";
	phone.trunOn();
       
	}
}
