package test.controller;

public class Test9 {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] array1 = new int[array.length * array[0].length];
		int count = 0;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array1[count] = array[i][j];
				count++;
			}
		}
		for (int i = 0; i < array1.length; i++) {
			for (int j = i+1; j < array1.length; j++) {
				if(array1[i]> array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("가장 큰 값 : " + array1[count - 1]);
		System.out.println("가장 작은 값 : " + array1[0]);
	}
}
