package 제어문;

import java.util.Scanner;

public class switchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력하세요 : ");
		
		int moonth = sc.nextInt();
		int day1;
		switch(moonth) {
				case 1 : case 3: case 5: case 7 : case 8 : case 10: case 12: day1 = 31; 
				break;
				
				case 4: case 6: case 9:case 11 : day1 = 30;
				break;
				
				case 2 : day1 = 28;
				break;
				
				default : System.out.println("잘못 입력하셨습니다.");
				return;
		}
		System.out.printf("입력하신 달의 날은 %d일 까지입니다.",day1);
	}

}
