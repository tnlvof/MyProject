package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int inum1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int inum2 = sc.nextInt();
		int result = inum1 * inum2;
		if (((inum1 & inum2) >= 1) && ((inum1 & inum2) <= 9)) {
			if (result >= 10) {
				System.out.println("두자리 수 입니다");
			} else {
				System.out.println("한자리 수 입니다.");
			}
		}else {
			System.out.println("1~9 사이의 수를 입력해주세요");
		}
	}
}
