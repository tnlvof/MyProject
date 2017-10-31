package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
	Scanner sc = new Scanner(System.in);
	public void exercise1() {
		//
		
		int iarr[][] = new int[3][4];
		
		int su = 1;
		
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = su++;
			}
		}
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				System.out.printf("%2d " , iarr[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void exercise2() {
		int inum1 = 0;
		int inum2 = 0;
		System.out.println("가로 행의 수를 입력하세요 : ");
		inum1 = sc.nextInt();
		System.out.println("세로 열의 수를 입력하세요 : ");
		inum2 = sc.nextInt();
		char ranArr[][] = new char[inum1][inum2];
		
		for (int i = 0; i < ranArr.length; i++) {
			for (int j = 0; j < ranArr[i].length; j++) {
				ranArr[i][j] = (char)((Math.random() * 26) + 65);
			}
		}
		for (int i = 0; i < ranArr.length; i++) {
			for (int j = 0; j < ranArr[i].length; j++) {
				System.out.print(ranArr[i][j] + "  ");
			}
			System.out.println("");
		}
	}
	
	public void exercise3() {
		String str[] = {"홍길동","이순신","유관순","윤봉길","장영실","임꺽정","장보고",
							"이태백","김정희","대조영","김유신","이사부"};
		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];
		int count = 0;
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[count];
				count++; 
			}
		}
		
		System.out.println("===1분단===");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.print(str1[i][j] + "  ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = str[count];
				count++; 
			}
		}
		
		System.out.println("===2분단===");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				System.out.print(str2[i][j] + "  ");
			}
			System.out.println("");
		}
		
	}
	
	public void exercise4() {
		String str[] = {"홍길동","이순신","유관순","윤봉길","장영실","임꺽정","장보고",
				"이태백","김정희","대조영","김유신","이사부"};
		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];
		int count = 0;
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[count];
				count++; 
			}
		}
		
		System.out.println("===1분단===");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.print(str1[i][j] + "  ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = str[count];
				count++; 
			}
		}
		
		System.out.println("===2분단===");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				System.out.print(str2[i][j] + "  ");
			}
			System.out.println("");
		}
		
		System.out.println("==========================");
		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String str3 = sc.nextLine();
		
	}
	
	public void test1() {
		int[] array = { 75, 10, 20, 7};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
	}
}
