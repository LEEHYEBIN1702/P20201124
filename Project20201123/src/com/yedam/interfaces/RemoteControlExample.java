package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();
		
//		audio.turnOn();
//		audio.turnOff();
		
		
//	    tv.turnOn();
//	    tv.turnOff();
	    
	    RemoteControl rc = audio;
	    rc.turnOn();
	    rc.turnOff();
	    
	    rc = tv;
	    rc.turnOn();
	    rc.turnOff();
	    //부모클래스처럼 상위 클래스가 구현 클래스를 포함할 수 있다.
	   
	}

}
