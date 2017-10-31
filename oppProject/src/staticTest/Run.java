package staticTest;

public class Run {

	public static void main(String[] args) {
		StaticSample ss = new StaticSample();
		ss.setCount(1);
		ss.setsCount(1);
		ss.printCounts();
		
		StaticSample ss2 = new StaticSample();
		ss2.printCounts();
		
	}
}
