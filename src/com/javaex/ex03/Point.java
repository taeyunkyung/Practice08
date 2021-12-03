package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성 하세요
	@Override
	public String toString() {
		return "[포인트] x:3, y:3 입니다.";
	}

}
