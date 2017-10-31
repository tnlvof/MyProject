package staticTest;

public class StaticSample {
	private int count =1;
	private static int sCount =1 ;
	private final double tax = 3.3;
	
	public void setCount(int changeCount) {
		count = changeCount;
	}
	public static void setsCount(int changeScount) {
		sCount = changeScount;
	}
	
	public void printCounts() {
		System.out.println("count : " + count);
		System.out.println("scount : " + sCount);
	}
}
