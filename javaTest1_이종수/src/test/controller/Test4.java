package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum1 = 0;
		int inum2 = 0;
		while (true) {
			System.out.println("(1~9) 첫번째 정수 입력 : ");
			inum1 = sc.nextInt();
			if ((inum1 < 1 || inum1 > 9)) {
				System.out.println("1~9 사이의 정수를 입력하세요");
				continue;
			}
			break;
		}
		while (true) {
			System.out.println("(1~9) 두번째 정수 입력 : ");
			inum2 = sc.nextInt();
			if ((inum1 < 1 || inum1 > 9)) {
				System.out.println("1~9 사이의 정수를 입력하세요");
				continue;
			}
			break;
		}
		System.out.println("합 : " + (inum1 + inum2));
		System.out.println("차 : " + (inum1 - inum2));
		System.out.println("곱 : " + (inum1 * inum2));
		System.out.println("나누기 : " + (inum1 / inum2));
	}
}
