package com.yedam.inheritance;

public class Child extends Parent { // 익스텐드 적고 상속 받고 싶은 클래스 이름 적기.
    //필드
	String field2;
	
	
	//생성자
	
	public Child () {
		super();
		
	}
    public Child (String field1, String field2) {
    	super(field1); // 슈퍼 뜻 - 부모 클래스가 가지고 있는 생성자를 호출해서 필드를 채우겠다는 뜻.
    	this.field2 = field2;
    }
    //메소드
    public void method2() {
    	super.method1(); //부모 클래스가 가지고 있는 메소드1을 호출해서 다시 메소드 투를 호출하겠다는 의미.
    	System.out.println("method2() 호출.");
    }
}
