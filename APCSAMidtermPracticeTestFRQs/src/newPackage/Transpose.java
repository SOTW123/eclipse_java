package newPackage;

import java.util.Arrays;

public class Transpose {
	static Transpose obj = new Transpose();
	
	static int[][] originalArray = {
			{1, 2, 3, 4, 5, 16},
			{6, 7, 8, 9},
			{10, 11, 12},
			{13, 14},
			{15}
	};
	
	static int[][] transposedArray = new int[originalArray[0].length][originalArray.length];
	
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
				
			}
		}
	}
	
	public static int[][] transpose(int[][] matrix) {
	    int rows = matrix.length;
	    int maxColumns = 0;
	    for (int i = 0; i < rows; i++) {
	        if (matrix[i].length > maxColumns) {
	            maxColumns = matrix[i].length;
	        }
	    }

	    int[][] transposedMatrix = new int[maxColumns][rows];

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            transposedMatrix[j][i] = matrix[i][j];
	        }
	    }
	    	print(transposedMatrix);																
	    	
	    
	    return transposedMatrix;
	}



	
	public static void main(String[] args) {
		transpose(originalArray);
	}

}
