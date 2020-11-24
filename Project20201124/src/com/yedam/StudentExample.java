package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
//		System.out.println(s1.getUni());
//		System.out.println(s1.getStuNum());

		Student s2 = new Student("yedam", "15-1234", "이혜빈", "경영학과");
//       System.out.println(s2.getUni());
//       System.out.println(s2.getStuNum());

		Student s3 = new Student("경북대", "15-4567");
		s3.setName("최유진");
		s3.setMajor("간호학과");
		s3.showInfo ();
//		System.out.println(s3.getUni());
//		System.out.println(s3.getStuNum());
//		System.out.println(s3.getName());
//		System.out.println(s3.getMajor());

		Student s4 = new Student("경북대", "15-4567");
		s4.setName("김다현");
		s4.setMajor("연극영화과");
		s4.showInfo ();
//		System.out.println(s4.getUni());
//		System.out.println(s4.getStuNum());
//		System.out.println(s4.getName());
//		System.out.println(s4.getMajor());

		Student[] students = { s1, s2, s3, s4 };
		for (Student student : students) {
			if (student != null)
				if ("경북대".equals(student.getUni())) {
					System.out.println(student.getUni());
					System.out.println(student.getName());
					System.out.println(student.getStuNum());
					System.out.println(student.getMajor());
				}

		}
      
	}
}