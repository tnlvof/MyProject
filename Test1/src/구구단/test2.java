package 구구단;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(i);
		}

		/*
		 * int num1 = sc.nextInt();
		 * 
		 * for (int i = num1; i >= 0; i--) { for (int j = 0; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
	}

}
