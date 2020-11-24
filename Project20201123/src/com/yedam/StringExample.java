package com.yedam;

import java.io.IOException;

public class StringExample {
   public static void main(String[] args) {
	  String str1 =  new String();
	  str1 = "Hello";
	  
	  byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
	  String str2 = new String(bytes);
	  System.out.println(str2.toString()); //바이트 배열 자리 값으로 헬로우 자바를 출력해냈다.
	  
	  String str3 = new String(bytes, 6,4); // 위에 배열을 여섯번째부터 시작해서 4번째까지 잘라서 srt3에 담자라는 뜻.
	  System.out.println(str3.toString()); // 32 74 97 118
	  
	  byte[] bytes2 = new byte [100];
//	  try {
//		int readByteNo = System.in.read(bytes2);
//		String str4 = new String(bytes2, 0, readByteNo);
//				System.out.println(str4); //내가 친 글자를 그대로 출력을 해줌 
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}  // 오류나서 예외처리 했음
	  
	  char chr = str2.charAt(0); // str2 첫번째 값에 0이 나오게
	  System.out.println(chr); // char은 문자변환변수 지정 
	  
}
}
