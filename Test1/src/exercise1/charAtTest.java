package exercise1;

import java.util.Scanner;

public class charAtTest {
	public void charAtTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println((i+1)+"번째 문자 : " + str.charAt(i));
		}
		
	}
}
