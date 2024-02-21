package soysauce;

import java.util.Arrays;

public class NewTimesTable {
		static NewTimesTable obj = new NewTimesTable();
		static int[][] array = new int[3][3];
		
		public int TimesTable(int n) {
			int i1 = 0;
			int i2 = 0;
			int Final = 0;
			
			for(int i = 1; i <= 3; i++) {
				
				for(n = 1; n <= 3; n++) {
					Final = n*i;
					array[i1][i2] = Final;
					
					i1++;
					i2++;
				 
				 
				}
			}
			return n;
		}
		
	public static void main(String[] args) {
		obj.TimesTable(array.length);
		
		// printing 2d array
		for (int[] x : array) {
		   for (int y : x) {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
		//
		
	}

}
