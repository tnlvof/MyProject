package 연습문제;

public class test1 {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int c= 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
