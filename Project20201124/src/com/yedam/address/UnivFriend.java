package com.yedam.address;

public class UnivFriend extends Friend {
	private String univ;
	private String major;

	
	public UnivFriend(String name, String phone) {
		super(name, phone);

	}

	
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override //부모가 가진 쇼인포 메소드를 재정의하는 기능 
	public void showFriendInfo() {
//		super.showFriendInfo(); 
		System.out.println("이름: " + super.getName()+ ", 연락처: " + super.getPhone() + ", 학교: " + this.univ +", 학과: " 
         +this.major); // 부모 클래스가 가진 메소드는 수퍼로 부름. 
}
}