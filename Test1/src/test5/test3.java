package test5;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력하세요");
		System.out.println("10의 자리 : ");
		int num1 = sc.nextInt();
		System.out.println("1의 자리 : ");
		int num2 = sc.nextInt();
		
		num1 = num1 *10;
		
		int num3 = num1 + num2;
		
		if(num3 % 2 ==0) {
			System.out.println(num3+" 은(는) 짝수입니다.");
		}else {
			System.out.println(num3+" 은(는) 홀수입니다.");
		}
		
		
	}

}
