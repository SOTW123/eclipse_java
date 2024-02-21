package newPackage;

public class ArrayTesting {
	int[][] array = {{1, 2, 3},
					 {4, 5, 6},
					 {7, 8, 9}
	};
	
	
	private void printHorizontal() {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
		}
		System.out.println();
	}
	private void printVertically() {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[j][i] + ", ");
			}
		}
		System.out.println();
	}
	private void printDiagonally() {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + ", ");
		}
				System.out.println();
		
		int j = 2;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][j] + ", ");
			j--;
		}
	}
	
	public static void main(String[] args) {
		ArrayTesting obj = new ArrayTesting();
		obj.printHorizontal();
		obj.printVertically();
		obj.printDiagonally();

	}

}
