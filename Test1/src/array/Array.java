package array;

import java.util.Random;
import java.util.Scanner;

public class Array {

	Scanner sc = new Scanner(System.in);

	public void array() {
		/*
		 * int[] iarr; iarr = new int[5];
		 * 
		 * for (int i = 0; i < iarr.length; i++) { iarr[i] = i+1; } for (int i = 0; i <
		 * iarr.length; i++) { System.out.println("iarr["+ i+ "] : " + iarr[i]); }
		 */

		String[] str = { "딸기", "바나나", "몰라", "대충", "하자" };

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public void array1() {
		int[] iarr;
		iarr = new int[10];

		for (int i = 0; i < iarr.length; i++) {
			iarr[i] = i + 1;
			System.out.println("iarr[" + i + "] : " + iarr[i]);
		}

		for (int i = iarr.length - 1; i >= 0; i--) {
			iarr[i] = i + 1;
			System.out.println("iarr[" + i + "] : " + iarr[i]);
		}
	}

	public void array2() {
		String[] str = { "딸기", "바나나", "복숭아", "키위", "사과" };
		System.out.println(str[1]);
	}

	public void array3() {
		System.out.println("입력값 : ");
		String str1 = sc.nextLine();
		System.out.println("검색값 : ");
		char ch1 = sc.nextLine().charAt(0);
		char[] chArr = str1.toCharArray();
		int count = 0;
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ch1) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 " + str1 + "에서 찾으시는 문자 " + ch1 + "은 " + count + "개 입니다.");
	}

	public void array4() {
		System.out.println("주민등록번호를 입력하세요 ");
		String str = sc.nextLine();

		/*
		 * char[] chArr = new char[str.length()]; for (int i = 0; i < str.length(); i++)
		 * { chArr[i] = str.charAt(i); }
		 */

		char[] chArr = str.toCharArray();
		char[] chArr1 = new char[str.length()];
		chArr1 = chArr.clone();

		System.out.print("원본 : ");
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}

		System.out.println("");
		System.out.println("");
		System.out.print("복사본 : ");
		for (int s = 0; s < chArr1.length; s++) {
			if (s >= ((str.length() / 2) + 1)) {
				chArr1[s] = '*';
			}
			System.out.print(chArr1[s]);
		}
	}

	public void array5() {
		int inum;
		while (true) {
			System.out.println("홀수인 양의 정수를 입력하세요");
			inum = sc.nextInt();
			if (inum % 2 != 0) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		int[] iArr = new int[inum];
		int middle = iArr.length / 2;
		int afterMid = 0;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
			if (i == middle) {
				afterMid = iArr[i];
			} else if (i > middle) {
				iArr[i] = --afterMid;
			}
			System.out.print(iArr[i]);
		}
	}

	public void array6() {
		int[] ranArr = new int[6];
		int temp = 0;
		for (int i = 0; i < ranArr.length; i++) {
			ranArr[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if(ranArr[i] == ranArr[j]) {
					i--;
					break;
				}
			}
		}
	
		for (int a = 0; a < ranArr.length; a++) {
			for (int b = a + 1; b < ranArr.length; b++) {
				if(ranArr[a] > ranArr[b]) {
					temp = ranArr[a];
					ranArr[a] = ranArr[b];
					ranArr[b] = temp;
				}
			}
			System.out.print(ranArr[a] + " ");
		}
	}
	
	
	
	public void array7() {
		//야구게임 만들기
				Scanner sc = new Scanner(System.in);
				
				int iarr[] = new int[4];
				int input[] = new int[4];
				int sCount = 0;
				int bCount = 0;
				int countDown = 10;
				
				for(int i = 0; i < iarr.length; i++){
					iarr[i] = new Random().nextInt(10);
					for(int j = 0; j < i; j++){
						if(iarr[i] == iarr[j]){
							i--;
							break;
						}
					}
				}
				
				/*for(int i = 0; i < iarr.length; i++){
					System.out.print(iarr[i] + " ");
				}
				System.out.println();*/
				
				do{
					sCount = 0;
					bCount = 0;
					System.out.println(countDown + "회 남으셨습니다.");
					System.out.print("4자리 숫자를 입력하세요 : ");
					String str = sc.nextLine();
					
					if(str.length() != 4){
						System.out.println("4자리의 정수를 입력해야 합니다.");
					}else{
						countDown--;
						
						for(int i = 0; i < input.length; i++){
							input[i] = (int)(str.charAt(i)-48);
							if(iarr[i] == input[i]){
								sCount++;
							}
						}
						
						for(int i = 0; i < iarr.length; i++){
							for(int j = 0; j < iarr.length; j++){
								if(input[i] != iarr[i] && iarr[i] == input[j]){
									bCount++;
								}
							}
						}
					}
					
					if(sCount == 4){
						System.out.println("정답입니다.");
						break;
					}else{
						System.out.println("아쉽네요 " + sCount + "S " + bCount + "B 입니다.");
					}
					
					if(countDown == 0){
						System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
						break;
					}
					
				}while(true);
	}
}
