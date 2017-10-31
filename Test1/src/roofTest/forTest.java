package roofTest;

public class forTest {
	public void forTest() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if(i % 2 ==0) {
				continue;
			}else{
				sum = sum + i; 
			}
		}
		
		System.out.println(sum);
		
		
		/*for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}*/
	}
}
