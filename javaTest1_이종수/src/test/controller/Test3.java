package test.controller;

public class Test3 {

	public static void main(String[] args) {
		double sum = 0;
		int i = 1;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		double avg = sum / 100.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
