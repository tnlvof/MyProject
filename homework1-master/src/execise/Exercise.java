package execise;

import java.util.Scanner;

public class Exercise {
	Scanner sc = new Scanner(System.in);

	public void exercise1() {
		System.out.println("1~10 ������ ������ �Է��Ͻÿ�");
		int num1 = sc.nextInt();
		if (num1 >= 1 && num1 <= 10) {
			System.out.println(num1 % 2 == 0 ? "¦��" : "Ȧ��");

		} else {
			System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
		}
	}

	public void exercise2() {
		System.out.println("Ű�� �Է��ϼ���(m) : ");
		double height = sc.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���(kg) : ");
		int weight = sc.nextInt();

		double bmi = weight / (height * height);
		System.out.println("BMI : " + bmi);

		if (bmi >= 30) {
			System.out.println("���Դϴ�.");
		} else if (bmi >= 25) {
			System.out.println("��ü���Դϴ�.");
		} else if (bmi >= 20) {
			System.out.println("����ü���Դϴ�.");
		} else {
			System.out.println("��ü���Դϴ�.");
		}

	}

	public void exercise3() {
		System.out.println("�� ���� ������ �Է��ϼ���.");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("������ (+, -, *, /, %) �� �ϳ��� �Է��ϼ���.");
		sc.nextLine();
		String st1 = sc.next();

		if (st1.equals("+")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 + num3));
		} else if (st1.equals("-")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 - num3));
		} else if (st1.equals("*")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 * num3));
		} else if (st1.equals("/")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 / num3));
		} else if (st1.equals("%")) {
			System.out.println(num2 + st1 + num3 + " : " + (num2 % num3));
		} else {
			System.out.println("�Է��Ͻ� ������ �����ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

	public void exercise4() {
		System.out.println("(��� �ٳ��� ������ Ű��) �� �ϳ��� ���ÿ�");
		String st2 = sc.nextLine();

		switch (st2) {
		case "���":
			System.out.println("����� ������ 1000���Դϴ�.");
			break;
		case "�ٳ���":
			System.out.println("�ٳ����� ������ 3000���Դϴ�.");
			break;
		case "������":
			System.out.println("�������� ������ 2000���Դϴ�.");
			break;
		case "Ű��":
			System.out.println("Ű���� ������ 5000���Դϴ�.");
			break;
		default:
			System.out.println("�ݵ�� ���� ���� �� �ϳ��� ������.");
		}

	}

	public void exercise5() {
		System.out.println("���� ���� ���� ������ �Է��ϼ���.");
		System.out.println("���� : ");
		int kor = sc.nextInt();
		System.out.println("���� : ");
		int eng = sc.nextInt();
		System.out.println("���� : ");
		int mat = sc.nextInt();
		
		double avg = (kor + eng + mat) / 3;
		
		if(avg >= 60) {
			if(kor < 40) {
				System.out.println("���� ������ ���� �̴޷� ���հ��Դϴ�.");
			}else if(eng <40) {
				System.out.println("���� ������ ���� �̴޷� ���հ��Դϴ�.");
			}else if(mat <40){
				System.out.println("���� ������ ���� �̴޷� ���հ��Դϴ�.");
			}else {
				System.out.println("��� : " + avg);
				System.out.println("�հ��Դϴ�.");
			}
		}else {
			System.out.println("��� : " + avg);
			System.out.println("������� �̴޷� ���հ��Դϴ�.");
		}
	}
	public void exercise6() {
		System.out.println("�� �޿� �Է� : ");
		long sal = sc.nextLong();
		System.out.println("����� �Է� : ");
		long sales = sc.nextLong();
		System.out.println("========================");
		System.out.println("����� : "+sales);
		double bonusPer;
		if(sales >= 50000000) {
			bonusPer = 5;
		}else if(sales >= 30000000) {
			bonusPer = 3;
		}else if(sales >= 10000000) {
			bonusPer =1;
		}else {
			bonusPer =0;
		}
		double bonus = sales *(bonusPer * 0.01);
		System.out.println("���ʽ��� : "+ bonusPer);
		System.out.println("�� �޿� : " + sal);
		System.out.println("���ʽ� �ݾ� : " + (long)bonus);
		long totalSal = (long)bonus + sal;
		System.out.println("========================");
		System.out.println("�� �޿� : " +  totalSal);
		
	}
}
