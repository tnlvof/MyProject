package test4;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입실한 시간 : ");
		int num1 = sc.nextInt();
		System.out.println("입실한 분 : ");
		int num2 = sc.nextInt();
		System.out.println("입실한 초 : ");
		int num3 = sc.nextInt();
		
		if(num1 <= 15) {
			if(num2 <=39) {
				if(num3<=59) {
					System.out.println("정상 출석되었습니다.");
				}else {
					System.out.println("지각입니다 사유서를 작성하세요");
				}
			}else {
				System.out.println("지각입니다 사유서를 작성하세요");
			}
		}else {
			System.out.println("지각입니다 사유서를 작성하세요");
		}
		
		
		
	}

}
