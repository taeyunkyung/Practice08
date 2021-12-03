package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Add a = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String numLine = sc.nextLine(); 
			
			try {
				String sArray[] = numLine.split(" "); // 공백 넣어서 쓰라고 지시해준건가?
				
				Integer[] iArray = new Integer[2];
				iArray[0] = Integer.parseInt(sArray[0]);
				iArray[1] = Integer.parseInt(sArray[2]);
						
				switch(sArray[1]) {
				case "+":
					a.setValue(iArray[0], iArray[1]);
					System.out.println(a.calculate());
					break;
						
				case "-":
					s.setValue(iArray[0], iArray[1]);
					System.out.println(s.calculate());
					break;
						
				case "*":
					m.setValue(iArray[0], iArray[1]);
					System.out.println(m.calculate());
					break;
						
				case "/":
					d.setValue(iArray[0], iArray[1]);
					System.out.println(d.calculate());
					break;
									
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			} catch(NumberFormatException e) { // 숫자가 아닌 것을 숫자형으로 변환하려고 할때 생기는 오류라고 함: /q
				System.out.println("종료합니다.");
				break;
			} 	
			
		}
		sc.close();	// 대안이 있을 것 같다..2
	}
}
