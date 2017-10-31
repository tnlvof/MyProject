package logic.home.model;

import java.util.Scanner;

public class VariableSample {

	public void myProfile() {
		//내 신상 정보를 변수에 담아 출력하기
		String name = "이종수";
		int age = 26;
		String gender = "남";
		String phone = "010-4903-9066";
		String address = "동작구 노량진동";
		
		System.out.println();
		System.out.println("***프로필 정보***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println();
	}

	public void empInformation() {
		//사원 정보를 키보드로 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("전화번호를 입력하세요 : ");
		String phone = sc.nextLine();
		System.out.println("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		String result = (gender == 'm' || gender == 'M') ? "남자" : "여자" ;
		
		System.out.println();
		System.out.println("***사원 정보***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + result);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println();
	}
	
	public void defaultValue() {
		byte a = 1;
		short b =10;
		int c = 100;
		long d =1000000L;
		float e = 0.1F;
		double f = 0.0001;
		char g = 'm';
		boolean aa = true;
		String bb = "홍길동";
		
		System.out.println();
		System.out.println("***기본 자료형 변수의 초기값***");
		System.out.println("* 논리형 *");
		System.out.println("boolean : " + aa);
		System.out.println("* 정수형 *");
		System.out.println("byte : " + a);
		System.out.println("short : " + b);
		System.out.println("int : " + c);
		System.out.println("long : " + d);
		System.out.println("* 실수형 *");
		System.out.println("float : " + e);
		System.out.println("double : " + f);
		System.out.println("* 문자형 *");
		System.out.println("char : " + g);
		System.out.println("String : " + bb);
		System.out.println();
		
	}
}
