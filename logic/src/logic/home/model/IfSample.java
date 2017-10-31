package logic.home.model;

import java.util.Scanner;

public class IfSample {
	//필드 = 전역변수
	Scanner sc = new Scanner(System.in);
	
	public void maxNumber() {
		System.out.println("두 개의 정수 입력");
		System.out.println("첫번째 정수 : ");
		int inum = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int inum2 =sc.nextInt();
		
		int max = 0;
		
		if(inum > inum2) {
			max = inum;
		}else if(inum < inum2) {
			max = inum2;
		}else {
			System.out.println("같은 수 입니다.");
		}
		System.out.println("큰 수 : " + max);
	}

	public void minNumber() {
		System.out.println("두 개의 정수 입력");
		System.out.println("첫번째 정수 : ");
		int inum = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int inum2 =sc.nextInt();
		
		int min = 0;
		
		if(inum < inum2) {
			min = inum;
		}else if(inum > inum2) {
			min = inum2;
		}else {
			System.out.println("같은 수 입니다.");
		}
		System.out.println("작은 수 : " + min);
	}

	public void threeMaxMin() {
		int min = 0;
		int max = 0;
		System.out.println("세 개의 정수 입력");
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min =  num1;
		}
		
		if(num3 > max) {
			max = num3;
		}
		if(num3 < min) {
			min = num3;
		}
		System.out.println("큰 수 : " + max + " 작은 수 : " + min );
	}

	public void checkEven() {
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		if(num1 != 0) {
			if(num1 % 2 ==0) {
				System.out.println("입력한 정수 "+ num1 + "은 짝수입니다.");
			}else {
				System.out.println("입력한 정수 "+ num1 + "은 홀수입니다.");
			}
		}else {
			System.out.println("입력한 정수는 0입니다.");
		}
	}
	public void isPassFail() {
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		
	}

	public void scoreGrade() {
		// TODO Auto-generated method stub 
		
	}

	public void checkPlusMinusZero() {
		// TODO Auto-generated method stub
		
	}

	public void whatCaracter() {
		// TODO Auto-generated method stub
		
	}

}
