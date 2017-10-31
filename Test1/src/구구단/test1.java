package 구구단;

public class test1 {

	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			for (int su = 1; su <= 9 ; su++) {
				if (dan % 2 != 0) {
					break;
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println("");
		}
	}

}
