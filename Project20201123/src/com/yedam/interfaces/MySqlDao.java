package com.yedam.interfaces;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MY sqlDB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MY sqlDB에 입력");
		
	}

	@Override
	public void update() {
		System.out.println("MY sqlDB를 변경");
		
	}

	@Override
	public void delete() {
		System.out.println("MY sqlDB에서 삭제");
		
	}
	

}
