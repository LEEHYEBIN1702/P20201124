package com.yedam.address;

public class CompFriend extends Friend {
	private String company;
	private String department;
	
	
	public CompFriend(String name, String phone) {
	   super (name, phone);
	   
	   
    }
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override //부모가 가진 쇼인포 메소드를 재정의하는 기능 
	public void showFriendInfo() {
//		super.showFriendInfo(); 
		System.out.println("이름: " + super.getName()+ ", 연락처: " + super.getPhone() + ", 회사: " + this.company +", 부서: " 
         +this.department); // 부모 클래스가 가진 메소드는 수퍼로 부름. 
	}
	
}