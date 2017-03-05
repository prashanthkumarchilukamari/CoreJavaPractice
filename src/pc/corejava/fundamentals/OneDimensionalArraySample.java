package pc.corejava.fundamentals;

import java.util.Arrays;

public class OneDimensionalArraySample {
	public static void main(String[] args) {

		int[] intArr;
		intArr = new int[3];
		intArr[0] = 1; // Array indexes starts with '0'
		intArr[1] = 2;
		intArr[2] = 3;

		System.out.println("intArr values are : ");
		for (int i = 0; i < intArr.length; i++)
			System.out.println(intArr[i]);

		// Below statement will throw ArrayIndexOutOfBoundsException
		// System.out.println(intArr[3]);

		int[] intArr2 = { 10, 20, 30, 40, 50 };
		System.out.println("\n intArr2 values are : ");
		for (int i : intArr2) {
			System.out.println(i);
		}

		int[] intArr3 = new int[] { 60, 70, 80,120,110, 90, 100 };
		System.out.println(intArr3);

		sortArrayElements(intArr3);
	}

	private static void sortArrayElements(int[] intArr3) {
		Arrays.sort(intArr3);
		System.out.println("\n intArr3 values are : ");
		for (int i : intArr3) {
			System.out.println(i);
		}
	}

}
