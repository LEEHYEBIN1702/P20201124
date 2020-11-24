package com.yedam;
import java.util.Scanner;
public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn; // 다른 패키지에 있기 때문에 그냥은 못 씀 임폴트 해서 쳐줘야함.
       System.out.println("Hello");
       
       Object o1 =  new Object (); 
       boolean sameOrDiff = o1.equals(new Object()); //위에 뉴 오브젝트랑 모양은 같지만 다른 뉴 오브젝트를 선언한 것.
       System.out.println(sameOrDiff);               // 그래서 o1과 뉴 오브젝트가 같은지 비교했을 때 값이 페일이 나온 것.
       
       System.out.println(o1.toString()); //오브젝트 o1이 가진 주소값이 보임.
	}
}
