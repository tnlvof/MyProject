package cast.practice;

import java.util.Scanner;

public class CastingSample {
	Scanner sc = new Scanner(System.in);
	
	public void printUnicode() {
		System.out.println("문자를 입력하시오");
		char uni1 = sc.nextLine().charAt(0);
		System.out.println((int)uni1);
		
	}
	
	public void calculatorScore() {
		System.out.println("국어 영어 수학 점수를 각각 입력하시오");
		System.out.println("국어");
		double score1= sc.nextDouble();
		System.out.println("영어");
		double score2 = sc.nextDouble();
		System.out.println("수학");
		double score3 = sc.nextDouble();
		
		int sum = (int)(score1 + score2 + score3);
		int avg = (int)(sum/3);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
	public void printBitCount() {
		System.out.println("정수를 입력하시오");
		int int1 = sc.nextInt();
		
		System.out.println(int1 +"의 2진수에 포함된 1의 개수 : " +Integer.bitCount(int1));
	}
}
