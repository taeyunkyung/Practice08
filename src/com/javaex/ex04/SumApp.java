package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요
		String[] sArray = numLine.split(" ");
		
		for (int i = 0; i < sArray.length; i++) {
			Integer[] s = new Integer[sArray.length];
			s[i] = Integer.parseInt(sArray[i]);
			sum = sum + s[i];
		}

		System.out.println("합:" + sum);

		sc.close(); // 대안이 있을 것 같다..1
	}

}
