package com.ydm;

import com.yedam.Car;

public class CarExample {
   public static void main(String[] args) {
	  Car c1 = new Car(); //패키지가 달라서 com.yedam에 있는 Car에 접근을 못함
	                      // 컴 예담 밑에 카에 퍼블릭 달아주고 임폴트 달아주기 (컨트롤 시프트 오)
	  Car c2 = new Car("현대");
	  
	  Car c3 = new Car("삼성", "SM5"); // 퍼블릭 지정해놓으면 다른 패키지에서도 접근 가능
	  
	  
	  
}
}
