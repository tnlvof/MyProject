package 연산자;

public class 증감연산자테스트 {

	public static void main(String[] args) {
		int num1 = 20;
		++num1;
		System.out.println(num1);
		
		int num2 = 10;
		num2++;
		System.out.println(num2);
		
		int a= 10;
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		
		int c =10;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
	}

}
