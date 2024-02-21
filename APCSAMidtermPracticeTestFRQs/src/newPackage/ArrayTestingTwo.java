package newPackage;

public class ArrayTestingTwo {
	String[][] xWins = {
	{"X", "O", "X"},
	{"O", "X", "O"},
	{"O", "O", "X"},
	};
	String[][] oWins = {
	{"X", "O", "X"},
	{"O", "X", "O"},
	{"O", "O", "O"},
	};
	String[][] draw = {
	{"X", "O", "X"},
	{"O", "X", "X"},
	{"O", "X", "O"},
	};
	
	public boolean winOrLose() {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		ArrayTestingTwo obj = new ArrayTestingTwo();
		obj.winOrLose();
	}

}
