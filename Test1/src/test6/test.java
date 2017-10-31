package test6;

import java.util.Random;
import java.util.Scanner;

public class test {
	Scanner sc = new Scanner(System.in);

	public void test() {
		int num, sum = 0;

		System.out.println("정수를 입력하세요 : ");

		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public void test1() {
		int num1, sum1 = 0;

		System.out.println("정수를 입력하세요 : ");

		num1 = sc.nextInt();
		int i = 1;
		while (i <= num1) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
			i++;
		}

		System.out.println(sum1);
	}

	public void test2() {
		System.out.println("정수를 입력하세요 : ");

		int num2;
		num2 = sc.nextInt();

		for (int i = 1; i <= num2; i++) {
			if (i % 2 != 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
	}

	public void test3() {

		int num3, quan, num4, price = 0, total = 0;
		;
		char ch1;
		String str1 = "";
		String order = "";
		int i = 1;

		do {
			System.out.println("주문하실 메뉴의 번호를 입력하세요 (1~9) ");
			num3 = sc.nextInt();
			System.out.println("주문하실 수량을 입력하세요 : ");
			quan = sc.nextInt();

			System.out.println("추가주문 하시겠습니까? (y/n)");
			sc.nextLine();
			String str = sc.nextLine().toUpperCase();

			switch (num3) {
			case 1:
				str1 = "상하이 스파이스 치킨버거";
				price += (quan * 5500);
				break;
			case 2:
				str1 = "빅맥";
				price += (quan * 5000);
				break;
			case 3:
				str1 = "베이컨 토마토 디럭스";
				price += (quan * 6000);
				break;
			case 4:
				str1 = "콜라";
				price += (quan * 1500);
				break;
			case 5:
				str1 = "사이다";
				price += (quan * 1500);
				break;
			case 6:
				str1 = "오렌지쥬스";
				price += (quan * 2000);
				break;
			case 7:
				str1 = "커피";
				price += (quan * 1000);
				break;
			case 8:
				str1 = "감자튀김";
				price += (quan * 700);
				break;
			case 9:
				str1 = "아이스크림";
				price += (quan * 1000);
				break;
			}

			order += (str1 + " - " + quan + "개 : " + price + "원");
			total += price;

			switch (str) {
			case "Y":
				order += "\n";
				break;
			case "N":
				System.out.println("=============================");
				System.out.println(order);
				System.out.println("=============================");
				System.out.println("total price : " + total);
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 종료합니다");
				return;
			}
		} while (true);

	}

	public void test5() {

		int num5 = (int) (Math.random() * 100) + 1;
		int num6 = 0;
		int i = 1;
		do {
			System.out.println("1~100 사이의 정수를 입력하세요");
			num6 = sc.nextInt();
			if (num6 < num5) {
				System.out.println("입력하신 정수보다 큽니다.");
			} else if (num6 > num5) {
				System.out.println("입력하신 정수보다 작습니다.");
			} else {
				System.out.println("정답입니다. " + i + "회 만에 정답을 맞추셨습니다.");
				break;
			}
			i++;
		} while (num5 != num6);
	}

	public void test6() {
		int num1;
		boolean disc = false;

		do {
			System.out.println("2를 초과하는 정수를 입력하세요 > ");
			num1 = sc.nextInt();
			if (num1 < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			} else {
				for (int i = 2; i < num1; i++) {
					if (num1 % 1 == 0) {
						disc = true;
						break;
					}
				}
				if (disc = true) {
					System.out.println("소수가 아니다.");
					break;
				}
			}
		} while (true);

	}

	public void test7() {
		System.out.println("문자열을 입력하세요 > ");
		String str = sc.nextLine();
		System.out.println("문자를 얼마나 밀까요? > ");
		int n = sc.nextInt();

		n = n % 26;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		System.out.println(result);

	}

	public void test8() {
		int num, num1, result = 0;
		System.out.println("받으신 금액을 입력하세요 : ");
		num = sc.nextInt();
		System.out.println("상품 가격을 입력하세요 : ");
		num1 = sc.nextInt();

		result = num - num1;
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int count, sum = result;
		String str = "";

		for (int i = 0; i < money.length; i++) {
			if (result >= money[i]) {
				count = sum / money[i];
				sum = (sum % money[i]);

				if (i <= 3) {
					str += money[i] + "원권 지폐" + count + "장";
				} else {
					str += money[i] + "원 동전" + count + "개";
				}
				str += "\n";
			}
		}

		System.out.println("=======================");
		System.out.println(str);
		System.out.println("=======================");
		System.out.println("거스름돈 : " + result);
	}

	public void test9() {
		int num, num1, result = 0;
		System.out.println("받으신 금액을 입력하세요 : ");
		num = sc.nextInt();
		System.out.println("상품 가격을 입력하세요 : ");
		num1 = sc.nextInt();
		String str = "";

		System.out.println("=======================");
		System.out.println(str);
		System.out.println("=======================");
		System.out.println("거스름돈 : " + result);
	}

	public void test10() {
		System.out.print("반드신 금액을 입력하세요 : ");
		int mon = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int get = sc.nextInt();

		int unit = 50000;
		int num = 0;
		int sw = 0;

		int rest = mon - get;

		while (true) {
			num = rest / unit;
			System.out.println(unit + "원권 지폐  " + num);

			if (unit <= 1)
				break;

			rest = rest - (unit * num);

			if (sw == 0) {
				unit = unit / 5;
				sw = 1;
			} else {
				unit = unit / 2;
				sw = 0;
			}
		}
	}

	public void test11() {
		int[] ranArr = new int[4];
		int[] inputArr = new int[4];
		int sCount = 0;
		int bCount = 0;
		int totalCount = 10;

		for (int i = 0; i < ranArr.length; i++) {
			ranArr[i] = new Random().nextInt(10);
			for (int j = 0; j < i; j++) {
				if (ranArr[i] == ranArr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(ranArr[i] + " ");
		}
		System.out.println();
		do {
			sCount = 0;
			bCount = 0;
			System.out.println(totalCount + "회 남으셨습니다.");
			System.out.println("정수 4자리를 입력하세요 : ");
			String str = "";
			str = sc.nextLine();

			if (str.length() != 4) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}else {
				totalCount--;
			}

			for (int i = 0; i < inputArr.length; i++) {
				inputArr[i] = (int)(str.charAt(i)-48);
			}
			for (int i = 0; i < inputArr.length; i++) {
				if (ranArr[i] == inputArr[i]) {
					sCount++;
				} else if (!(ranArr[i] == inputArr[i])) {
					for (int j = 0; j < ranArr.length; j++) {
						if (ranArr[i] == inputArr[j]) {
							bCount++;
						}
					}
				}
			}
			System.out.println(sCount + "S " + bCount + "B");

			if (sCount == 4) {
				System.out.println("정답입니다.");
				totalCount = 0;
			}
			if (totalCount == 0) {
				return;
			}
		} while (true);
	}
}
