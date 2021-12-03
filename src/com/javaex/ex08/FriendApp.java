package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] name = new String[3];
		String[] phone = new String[3];
		String[] school = new String[3];

		System.out.println("친구를 3명 등록해주세요");

		for (int y = 0; y < 3; y++) {
			String infoLine = sc.nextLine();
			String[] Friend = infoLine.split(" ");

			name[y] = Friend[0];
			phone[y] = Friend[1];
			school[y] = Friend[2];
		}

		for (int i = 0; i < 3; i++) {
			System.out.print("이름:" + name[i]);
			System.out.print(" 핸드폰:" + phone[i]);
			System.out.println(" 학교:" + school[i]);
		}

		sc.close(); // 대안이 있을 것 같다..3
	}

}
