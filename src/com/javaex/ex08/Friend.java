package com.javaex.ex08;

public class Friend {

	private String name;
	private String hp;
	private String school;

	public Friend() {

	}

	public Friend(String info) {
		String[] friend = info.split(" ");
		this.name = friend[0];
		this.hp = friend[1];
		this.school = friend[2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void showInfo() {
		System.out.print("이름:" + name);
		System.out.print(" 핸드폰:" + hp);
		System.out.println(" 학교:" + school);
	}
}
