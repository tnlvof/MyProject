package test.controller;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] copyAr = new int[array.length * array[0].length];
		int count = 0;
		boolean abc = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] % 3 == 0) {
					for (int a = 0; a < copyAr.length; a++) {
						if(copyAr[a] == array[i][j]) {
							abc = true;
						}
					}
					if(abc == false) {
						copyAr[count] = array[i][j];
						count++;
					}
				}
			}
			abc = false;
		}
		for (int i = 0; i < count; i++) {
			System.out.print(copyAr[i] + "  ");
		}
	}
}
