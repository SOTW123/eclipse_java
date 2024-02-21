package newPackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Testing {
	public static int[][] Example = {
			{-1, 2, 3, 4},
			{5, 6, 7},
			{8, 9},
	};
	
	private static boolean sequentialSearch(int[][] array, int target) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] == target) {
					System.out.println(true);
					return true;
				}
			}
		}
		System.out.println(Arrays.toString(Example));
		System.out.println(false);
		return false;
	}
	
	public static void main(String[] args) {
		sequentialSearch(Example, 10);

	}
}
