package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp2 {

	public static void main(String[] args) {

		System.out.println("친구를 3명을 등록하세요");
		Scanner sc = new Scanner(System.in);

		Friend[] fArray = new Friend[3];
		for (int i = 0; i < 3; i++) {
			String info = sc.nextLine();
			fArray[i] = new Friend(info);
		}

		for (int i = 0; i < 3; i++) {
			fArray[i].showInfo();
		}

		sc.close();
	}

}
