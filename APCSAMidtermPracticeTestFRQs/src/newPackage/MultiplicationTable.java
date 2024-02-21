public class MultiplicationTable {
	static int result;

	private static int multiplyNumbers(int num1, int num2) {
		for (int i = 0; i < num2; i++) {
			result += num1;
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		
	}
}
