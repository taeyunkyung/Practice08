package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Add a = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String numLine = sc.nextLine();

			try {
				String sArray[] = numLine.split(" "); // 공백 넣어서 쓰라고 지시해준건가?

				// 배열에 넣어줄 필요가 없었음2
				int num01 = Integer.parseInt(sArray[0]); // int leftVal
				int num02 = Integer.parseInt(sArray[2]); // int middleVal
				String middleVal = sArray[1];

				switch (middleVal) {
				case "+":
					// Add a = new Add();
					a.setValue(num01, num02);
					// result = a.calculate()
					System.out.println(">> " + a.calculate()); // result
					break;

				case "-":
					s.setValue(num01, num02);
					System.out.println(">> " + s.calculate());
					break;

				case "*":
					m.setValue(num01, num02);
					System.out.println(">> " + m.calculate());
					break;

				case "/":
					d.setValue(num01, num02);
					System.out.println(">> " + d.calculate());
					break;

				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			} catch (NumberFormatException e) { // 숫자가 아닌 것을 숫자형으로 변환하려고 할때 생기는 오류라고 함: /q
				System.out.println("종료합니다.");
				break;
				// if(numLine.equals("/q")) {...} 사용해도 됨
			}

		}
		sc.close(); 
	}
}
