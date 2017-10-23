package 제어문;

import java.util.Scanner;

public class switchTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 과일을 선택하세요 1.사과 2.바나나 3.오렌지 : ");
		int num = sc.nextInt();
		String color = "";

		switch (num) {
		case 1:
			color = "빨간색";
			break;
		case 2:
			color = "노란색";
			break;
		case 3:
			color = "주황색";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println("선택한 과일의 색상은 : " +color);
	}

}
