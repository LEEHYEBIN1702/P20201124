package com.yedam.interfaces;

public class Television implements RemoteControl { //리모트 컨트롤을 구현하는 클래스

	@Override
	public void turnOn() {
		System.out.println("티비를 킵니다.");
		
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	
		
	}

}
