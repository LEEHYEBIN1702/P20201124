package com.yedam.abstracts;

public abstract class Phone {
	public String owner;
	public Phone() {}
	public Phone (String owner) {
		this.owner=owner;
		
	}
    public void trunOn () {
    	System.out.println("폰전원을 켭니다.");
    }
    public abstract void ring(); 
    // 부모 클래스에 추상 메소드가 생기면 상속 받는 자식 클래스들은 그걸 구현하는 메소드가 반드시 있어야 한다.
    public abstract void turnOff();
    
}
