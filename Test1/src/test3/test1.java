package test3;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하시오 : ");
		int dm = sc.nextInt();
		int PI = 3;
		double area, round;
		
		area = dm*dm *PI;
		round = 2*dm*PI;
		
		System.out.println("원의 넓이는 " + area + " 입니다.");
		System.out.println("원의 둘레는 " + round + " 입니다.");
		
	}

}
