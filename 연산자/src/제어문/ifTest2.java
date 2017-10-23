package 제어문;

import java.util.Scanner;

public class ifTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력하세요 : ");
		int point = sc.nextInt();
		String grade = "";

		if (point >= 90) {
			grade = "A";
			if (point >= 95) {
				grade += "+";
			}
		} else if (point >= 80) {
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.printf("당신의 점수는 %d 이고, 등급은 %s입니다.", point, grade);
	}

}
