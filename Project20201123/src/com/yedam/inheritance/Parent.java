package com.yedam.inheritance;
    //필드
public class Parent {
    String field1;
    
    //생성자
    public Parent() {
    	
    }
    public Parent(String field1) {
    	this.field1 = field1;
    }
    
    //메소드
    public void method1() {
    	System.out.println("parent method1() 호출."); //부모의 메소드 값을 바꾸니까 자식들의 출력값도 바뀌어 보여진다.
    }
    
}
