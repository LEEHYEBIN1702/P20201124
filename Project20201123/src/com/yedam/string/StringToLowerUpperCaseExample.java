package com.yedam.string;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
       String str1 = "JAVA Programming";
       String str2 = "JAVA Programming";
       
       System.out.println(str1.equals(str2));
       
       String lowerStr1 = str1.toLowerCase();
       String lowerStr2 = str2.toLowerCase();
       
       System.out.println(lowerStr1.equals(str2));
       
       System.out.println(str1.equalsIgnoreCase(str2));
	}
}
