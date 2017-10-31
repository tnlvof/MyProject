package test4;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 입력하세요 (1.짜장면 2.짬뽕 3. 볶음밥 4.탕수육)");
		int menu = sc.nextInt();

		String menu1;
		switch (menu) {
		case 1:
			menu1 = "짜장면";
			break;
		case 2:
			menu1 = "짬뽕";
			break;
		case 3:
			menu1 = "볶음밥";
			break;
		case 4:
			menu1 = "탕수육";
			break;
		}
		System.out.println("추가 주문 하시겠습니다? (y/n)");
		sc.nextLine();
		char menu2 = sc.nextLine().charAt(0);
		if (menu2 == 'y') {
			System.out.println("서비스가 제공됩니다.");
		} else if (menu2 == 'n') {
			System.out.println("서비스가 제공되지 않습니다.");

		} else {
			System.out.println("y 나 n 을 입력하세요.");
		}

	}

}
