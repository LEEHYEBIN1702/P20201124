package com.yedam.db;



import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// 사원정보, 부서정보,
		while (true) {
			System.out.println("===============================");
			System.out.println("1.사원정보 2.부서정보 3.사원입력 4.종료");
			System.out.println("===============================");
			int selectNo = scn.nextInt();scn.nextLine();
			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getEmpList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showEmpInfo();
					}
				}

			} else if (selectNo == 2) {
				EmpDAO dao = new EmpDAO();
				Department[] departments = dao.getDeptList();
				for (Department dept : departments) {
					if (dept != null) {
						dept.showDeptInfo();
					}
				}
			} else if (selectNo == 3) {
				addEmployee();
			} else if (selectNo == 4) {
				break;
			}
		}
		EmpDAO dao = new EmpDAO();
		Employee[] employees = dao.getEmpList();
		for (Employee emp : employees) {
			if (emp != null) {
				emp.showEmpInfo();
				// 예외때문에 오류가 생김 그럴 땐 예외처리나 이프 사용하면 됨.
			}
		}
		System.out.println("end of prog");
	}//end of main ()
	
	public static void addEmployee() {
		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		System.out.println("이메일을 입력하세요");
		String email = scn.nextLine();
		System.out.println("직무를 입력하세요");
		String jobId = scn.nextLine();
		System.out.println("입사 일자를 입력하세요.");
		String hireDate = scn.nextLine();
		
		Employee emp = new Employee(name, email, hireDate, jobId);
		EmpDAO dao = new EmpDAO();
		dao.insertEmployee(emp);
	}
}//end of class
