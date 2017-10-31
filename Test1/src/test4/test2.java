package test4;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 까지의 정수를 입력하세요 : ");
		char num1 = sc.nextLine().charAt(0);
		char num2 = sc.nextLine().charAt(1);
		sc.nextLine();

		if (num1 == ('3' |'6' | '9') && !(num2 == ('3' |'6' | '9'))) {
			System.out.println("박수짝");
		}

	}

}
