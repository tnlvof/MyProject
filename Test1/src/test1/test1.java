package test1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 세 변의 길이를 입력하세요");
		System.out.println("첫번째 변 : ");
		int line1 = sc.nextInt();
		System.out.println("두번째 변 : ");
		int line2 = sc.nextInt();
		System.out.println("세번쨰 변 : ");
		int line3 = sc.nextInt();
		
//		빗변찾기
		int temp;
		
		if( line2 > line1) {
			temp = line1;
			line1 = line2;
			line2 = temp;
		};
		if( line3 > line1) {
			temp = line1;
			line1 = line3;
			line3 = temp;
		}
		if(line1 >(line2+line3)){
			System.out.println("삼각형이 아닙니다.");
			return;
		}
		
		if(line1 *line1 == line2* line2 + line3 * line3) {
			System.out.println("=============");
			System.out.println("직각삼각형입니다.");
		}else {
			System.out.println("=============");
			System.out.println("직각삼각형이 아닙니다.");
		}
	}

}
