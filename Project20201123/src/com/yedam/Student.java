package com.yedam;

public class Student {
   
	 //학교 학생번호 이름 전공 
	   String uni; 
	   String stuNum; //15-1234
	   String name;
	   String major;
	   
	   Student () {
		   
	   }
	   
	   Student (String uni) {
		   this.uni = uni;
	   }
	   
	   Student (String uni, String stuNum) {
		   this.uni= uni;
		   this.stuNum=stuNum;
	   }

	   Student(String uni, String stuNum, String name, String major) {
		super();
		this.uni = uni;
		this.stuNum = stuNum;
		this.name = name;
		this.major = major;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	    
    public void showInfo () {
    	System.out.println("학교는:" + uni +" "+ "학번은:"+ stuNum +" "+ "이름은:"+ name +" " + "전공은:"+ major);
    }
}
