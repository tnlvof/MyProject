package test3;

public class test2 {

	public static void main(String[] args) {
		int a = 25, b= 75, c=50, temp=0;
		
		if(b>a) {
			temp = a;
			a = b;
			b = temp;
		}
		if(c>b) {
			temp = c;
			c = b;
			b = temp;
		}
		
		System.out.printf("%d %d %d" , a, b, c );
	}

}
