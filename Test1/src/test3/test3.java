package test3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나라를 선택해주세요 : ");
		String nation = sc.nextLine();
		System.out.println("좌석을 선택해주세요 : ");
		int seat = sc.nextInt();
		System.out.println("기내식을 선택해주세요 : ");
		int food = sc.nextInt();
		
		int tiket;
		double total, fees;
		
		switch(nation) {
		case "영국" : tiket = 1000000;
		break;
		case "독일" : tiket = 800000;
		break;
		case "중국" : tiket = 400000;
		break;
		case "일본" : tiket = 300000;
		break;
		}
		
		String seat1;
		
		switch(seat) {
		case 1 : seat1 = "이코노미";
		
		
		}
//		total = tiket + seat + food + fees;
		
		System.out.println("목적지 : " + nation);
		System.out.println();
	}
	
}
