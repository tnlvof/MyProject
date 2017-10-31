package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int inum = sc.nextInt();
		if (inum >= 1 && inum <= 100) {
			if (inum % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("1~100 사이의 정수가 아닙니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
