package test.controller;

public class Test2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				sum = i * j;
				if(sum % 2 != 0) {
					System.out.println( i + " * " + j + " = " + sum );
				}
			}
			System.out.println();
		}
	}
}
