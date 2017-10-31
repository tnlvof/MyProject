package logic.home.model;
import java.util.Scanner;
import org.omg.Messaging.SyncScopeHelper;

public class ForSample {
	Scanner sc = new Scanner(System.in);

	public void sum1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 의 합 : " + sum);
	}
	public void sumEven1To100() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100 까지 짝수 합 : " + sum);
	}

	public void oneGugudan() {
		System.out.println("정수 하나 입력 : ");
		int dan = sc.nextInt();
		int result;

		for (int su = 1; su < 10; su++) {
			result = dan * su;
			System.out.println(dan + " * " + su + " = " + result);
		}
	}

	public void sumMinToMax() {
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 입력 : ");
		int num2 = sc.nextInt();
		int max = 0;
		int min = 0;
		int sum = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "~" + max + " 까지의 합 : " + sum);

	}

	public void printStar() {
		System.out.println("줄 수 : ");
		int num1 = sc.nextInt();
		System.out.println("칸 수 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 0; j <= num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printNumberStar() {
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if (i == j) {
					System.out.print(i);
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	public void printTriangleStar() {
		int line = sc.nextInt();
		if (line > 0) {
			for (int i = 1; i <= line; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (line < 0) {
			for (int i = 1; i <= -line; i++) {
				for (int j = -line; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("입력한 값은 0입니다.");
		}
	}

	public void guguDan() {
		for (int dan = 2; dan <= 9; dan++) {
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
	}
}
