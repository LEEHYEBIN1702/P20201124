package com.yedam;

public class CalExample {
	public static void main(String[] args) {
//     Calculator c1 =  new Calculator ();
//    c1.setColor("white"); // 보이드 붙은 set color는 인스턴스 생성해서 호출해야 함 

//     c1.plus (3,5); // 이렇게 해도 상관은 없는데 
		Calculator.plus(3, 5); // 스테이틱이 붙으면 인스턴스 없이 바로 클래스명 붙여서 쓸 수 있음
								// CarExample 참고.

		int result = Calculator.plus(3, 5);
		System.out.println(result);

		System.out.println(Calculator.pi); // pi 역시 스테이틱 붙였기 때문에 인스턴스 안 만들어도 호출 가능.

		result = Calculator.minus(10, 5);
		System.out.println(result);

		CalExample ce1 = new CalExample();
		result = ce1.sum(3, 5);

	}

	public int sum(int a, int b) {
		return a + b; // 얘는 스테이틱 안 붙여서 위에 인스턴스 하나 만들어줌
						// 근데 인트 앞에 스테이틱 붙여주고 인스턴스 삭제해줘도 똑같이 답 나옴.
	}

}
