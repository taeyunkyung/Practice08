package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해주세요");

		Friend[] fArray = new Friend[3];
		for (int i = 0; i < 3; i++) {
			String infoLine = sc.nextLine();
			String info[] = infoLine.split(" ");

			String name = info[0];
			String hp = info[1];
			String school = info[2];

			Friend friend = new Friend(name, hp, school);
			fArray[i] = friend;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("이름:" + fArray[i].getName() + 
						     " 핸드폰:" + fArray[i].getHp() +
						     " 학교:" + fArray[i].getSchool()
						     );
		}

		sc.close();
	}

}
