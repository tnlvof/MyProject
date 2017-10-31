package test5;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 국물있는 or 국물없는 : ");
		String st1 = sc.nextLine();
		
		
		
		String st3 = null;
		switch(st1) {
		case "국물있는" :
			System.out.println("2. 매콤 or 안매콤 : ");
			String st2 =sc.nextLine();
			switch(st2) {
			case "매콤" : st3 = "라면, 잠뽕 ,매운탕, 부대찌개";
			break;
			case "안매콤" : st3 = "우동, 순대국, 설렁탕";
			break;
			}
			break;
		case "국물없는" :
			System.out.println("2. 분식 or 안분식 : ");
			String st4 =sc.nextLine();
			switch(st4) {
			case "안분식" : st3 = "곱창볶음 ,비빔밥, 순대볶음, 떡볶이";
			break;
			case "분식" : st3 = "김밥, 자장면, 주먹밥";
			break;
			}
			break;
		}
		System.out.println("결정장애 추천 메뉴는 " + st3 + " 등이 있습니다.");
	}

}
