package com.yedam;

public class Calculator {
    private String color;
    static double pi = 3.14; // 스테이틱
    public void setColor (String color) {
    	this.color = color;
    	
    }
    
    public static int plus (int a, int b) { // 스테이틱
    	return a+b;
    	
    }
    
    public static int minus (int a, int b) {
    	return a-b;
    }
}
