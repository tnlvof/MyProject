package test2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 200까지의 정수를 입력하세요");

		int num1 = sc.nextInt();

		if (num1 <= 200 && num1 >= 1) {
			if (!(num1 % 2 == 0) && num1 % 13 == 0 && num1 <= 100) {
				num1 = num1 + 2;
			}else {
				if (!(num1 % 2 == 0) && num1 % 13 == 0) {
					++num1;
				} else if (!(num1 % 2 == 0) && num1 <= 100) {
					--num1;
				}
			}
			System.out.println(num1);
		} else {
			System.out.println("1에서 200까지의 수를 입력해야 합니다.");
		}

	}

}
