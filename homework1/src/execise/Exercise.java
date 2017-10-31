package execise;

import java.util.Scanner;

public class Exercise {
	Scanner sc = new Scanner(System.in);

	public void exercise1() {
		System.out.println("1~10 사이의 정수를 입력하시오");
		int num1 = sc.nextInt();
		if (num1 >= 1 && num1 <= 10) {
			System.out.println(num1 % 2 == 0 ? "짝수" : "홀수");

		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
	}

	public void exercise2() {
		System.out.println("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게를 입력하세요 : ");
		int weight = sc.nextInt();

		double bmi = weight / ((height * 0.01) * (height * 0.01));
		System.out.println("BMI : " + bmi);

		if (bmi >= 30) {
			System.out.println("비만입니다.");
		} else if (bmi >= 25) {
			System.out.println("과체중입니다.");
		} else if (bmi >= 20) {
			System.out.println("정상체중입니다.");
		} else {
			System.out.println("저체중입니다.");
		}

	}

	public void exercise3() {
		System.out.println("두 개의 정수를 입력하세요.");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("연산자 (+, -, *, /, %) 중 하나를 입력하세요.");
		sc.nextLine();
		String st1 = sc.next();

		if (st1.equals("+")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 + num3));
		} else if (st1.equals("-")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 - num3));
		} else if (st1.equals("*")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 * num3));
		} else if (st1.equals("/")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 / num3));
		} else if (st1.equals("%")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 % num3));
		} else {
			System.out.println("입력하신 연산은 없습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}

	public void exercise4() {
		System.out.println("(사과 바나나 복숭아 키위) 중 하나를 고르시오");
		String st2 = sc.nextLine();

		switch (st2) {
		case "사과":
			System.out.println("사과의 가격은 1000원입니다.");
			break;
		case "바나나":
			System.out.println("바나나의 가격은 3000원입니다.");
			break;
		case "복숭아":
			System.out.println("복숭아의 가격은 2000원입니다.");
			break;
		case "키위":
			System.out.println("키위의 가격은 5000원입니다.");
			break;
		default:
			System.out.println("반드시 위의 과일 중 하나를 고르세요.");
		}

	}

	public void exercise5() {
		System.out.println("국어 영어 수학 점수를 입력하세요.");
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int mat = sc.nextInt();
		
		double avg = (kor + eng + mat) / 3;
		
		if(avg >= 60) {
			if(kor < 40) {
				System.out.println("국어 과목의 점수 미달로 불합격입니다.");
			}else if(eng <40) {
				System.out.println("영어 과목의 점수 미달로 불합격입니다.");
			}else if(mat <40){
				System.out.println("수학 과목의 점수 미달로 불합격입니다.");
			}else {
				System.out.println("평균 : " + avg);
				System.out.println("합격입니다.");
			}
		}else {
			System.out.println("평균 : " + avg);
			System.out.println("평균점수 미달로 불합격입니다.");
		}
	}
	public void exercise6() {
		System.out.println("월 급여 입력 : ");
		long sal = sc.nextLong();
		System.out.println("매출액 입력 : ");
		long sales = sc.nextLong();
		System.out.println("========================");
		System.out.println("매출액 : "+sales);
		double bonusPer;
		if(sales >= 50000000) {
			bonusPer = 5;
		}else if(sales >= 30000000) {
			bonusPer = 3;
		}else if(sales >= 10000000) {
			bonusPer =1;
		}else {
			bonusPer =0;
		}
		double bonus = sales *(bonusPer * 0.01);
		System.out.println("보너스율 : "+ bonusPer);
		System.out.println("월 급여 : " + sal + "%");
		System.out.println("보너스 금액 : " + (long)bonus);
		long totalSal = (long)bonus + sal;
		System.out.println("========================");
		System.out.println("총 급여 : " +  totalSal);
		
	}
}