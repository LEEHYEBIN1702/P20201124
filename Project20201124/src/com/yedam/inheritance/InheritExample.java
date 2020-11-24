package com.yedam.inheritance;

public class InheritExample {
   public static void main(String[] args) {
	  Parent p1 = new Parent ("필드값1");
	  System.out.println(p1.field1);
	  p1.method1();
	  
	  Child c1 = new Child ("자식필드1", "자식필드2");
	  System.out.println(c1.field1);
	  System.out.println(c1.field2);
	  c1.method1();
	  c1.method1();
	  
	  NewChild nc1= new NewChild ("또다른자식1","또다른자식3" );
	  System.out.println(nc1.field1);
	  System.out.println(nc1.field3);
	  nc1.method1();
	  nc1.method3();
	 
	  GrandChild gc1 = new GrandChild(); //아무것도 입력된 값이 없지만 부모 클래스를 상속 받았기에 결과가 보여진다.
	  System.out.println(gc1.field1);
	  System.out.println(gc1.field2);
	  gc1.method1();
	  gc1.method2();
	  
	  Parent p = new Parent ();
	  p = new Child ();
	  p = new GrandChild();
	  //차일드 그랜드차일드가 값은 더 많아보여도 페어런트가 자식들을 품는 구조 부모 클래스가 가장 큼.
	  
	  // child c = new Parent ();
	  // 부모 클래스가 더 크기 때문에 차일드에 부모를 담을 수 없어서 오류가 나는 것.
	  
	  //long > int > short> byte;
	  //상속의 관계는 아니지만 가장 큰 롱이 가장 작은 바이트부터 인트 쇼트 다 담을 수 있는 것도 같은 원리.
	  
	  
	  
}
}
