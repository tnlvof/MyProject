package keyboard.test;

import java.util.Scanner;

public class keyboardTest {

	public void input() {
		String name;
		int age;
		char gender;
		String address;
		double height;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next().charAt(0);
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.print("신장을 입력하세요 : ");
		height = sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + address);
		System.out.println("신장 : " + height);
	}
}
