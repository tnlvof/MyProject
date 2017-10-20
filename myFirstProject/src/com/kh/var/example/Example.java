package com.kh.var.example;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);

	public void example1() {
		
		int num1;
		int num2;
		
		System.out.println("정수 두 개를 입력하세요");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		System.out.println("나누기 몫 : "+ (num1 / num2));
		System.out.println("나누기 나머지 : "+ (num1 % num2));
		
	}
	
	public void example2() {
		
		double num3;
		double num4;
		
		System.out.println("가로 세로 값을 입력하세요");
		System.out.println("가로");
		num3 = sc.nextDouble();
		System.out.println("세로");
		num4 = sc.nextDouble();
		
		System.out.println("면적 : " + num3 * num4);
		System.out.println("둘레 : " + ((num3+num4)*2));
		
	}
	
	public void example3() { 
		
		String st1;
		
		System.out.println("문자열을 입력하시오");
		st1 = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + st1.charAt(0));
		System.out.println("두번째 문자 : " + st1.charAt(1));
		System.out.println("세번째 문자 : " + st1.charAt(2));
		
	}
}
