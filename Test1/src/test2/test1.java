package test2;

import java.util.Scanner;

public class test1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("방향을 입력하세요 (왼, 오, 위, 아)");
		String st1 = sc.nextLine();
		
		if(st1.equals("오")) {
			String st2 = sc.nextLine();
			if(st2.equals("아")) {
				String st3 = sc.nextLine();
				if(st3.equals("왼")) {
					String st4 = sc.nextLine();
					if(st4.equals("아")) {
						String st5 = sc.nextLine();
						if(st5.equals("아")) {
							System.out.println("미궁 탈출에 성공하셨습니다.");
						}else {
							System.out.println("게임을 종료합니다");
							return;
						}
					}else {
						System.out.println("게임을 종료합니다");
						return;
					}
				}else {
					System.out.println("게임을 종료합니다");
					return;
				}
			}else {
				System.out.println("게임을 종료합니다");
				return;
			}
		}else {
			System.out.println("게임을 종료합니다");
			return;
		}
	}
	
}


//미궁탈출게임을 만드세요. if문과 else문을 활용하세요. 사용자에게 4가지 방향
//(왼쪽은 왼, 오른쪽은 오, 위쪽은 위, 아래는 아)를 입력받아
		
		//방향이 맞다면 다시 방향을 입력받고, 틀리면 게임이 종료되게 하세요.
		//오른쪽, 아래, 왼쪽, 아래, 아래를 입력하면 미궁이 탈출되도록 설정하세요!
		//5번의 방향을 연속으로 모두 맞게 입력했다면 미궁 탈출했다는 메세지를 출력하세요
		// 중간에 한번이라도 틀리게 입력한다면 게임은 종료됩니다!
