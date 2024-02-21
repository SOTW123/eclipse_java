package soysauce;

import java.util.Arrays;

public class TimesTableClass {
	
	public static void TimesTable(int n) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < array.length; i++) {
			array[i] *= n;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void FullTimesTable() {
		for(int i = 1; i < 10; i++) {
			TimesTable(i);
		}
	}
	
	public static void main(String[] args) {
		FullTimesTable();
	}
}
