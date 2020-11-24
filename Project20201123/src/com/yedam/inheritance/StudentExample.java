package com.yedam.inheritance;

public class StudentExample {
   public static void main(String[] args) {
	Student st1 = new Student();
	st1.name= "Hong";
	st1.school = "Yedam";
	st1.study();
	
	HighStudent hs1 = new HighStudent();
	hs1.name= "Hwang";
	hs1.school= "Ydm";
	hs1.grade= "2";
	hs1.study();
	hs1.showGrade();
	
	//Student > HighStudent
	st1 = new HighStudent();
	
//	hs1 = new Student();
	// 스튜던트가 하이스쿨보다 큰 개념이기 때문에 오류가 나는 것 
			
}
}
