package newPackage;
import java.util.Scanner;

public class NewBasePairing {
	// 1) user inputs base pairing letters (minimum 3 characters)
		// - has to be correct amount (modulo 3)
		// - has to be correct letters
	// 2) program offers to user if convert to RNA nucleotides or DNA nucleotides
	// 3) outputs alternate strand depending on 
	static NewBasePairing obj = new NewBasePairing();
	static Scanner input = new Scanner(System.in);
	StringBuilder x1 = new StringBuilder();
	
	public String basePairs(String str) {
		
		int len = str.length(); // length of string
		
		// Checks if correct amount of characters are inputed (spaces and special chars are excluded at next checkpoint)
		if((len % 3) == 0) {
			
		}
		else if(len % 3 != 0){
			System.out.println("This is the wrong amount of nucleotides and cannot be converted during translation process.");
		}
		
		// Checks if correct letters are inputed
		if(str.contains("B") || str.contains("[C-F]") || str.contains("[H-S]") || str.contains("[V-Z]")) {
			System.out.println("The wrong letters have been inputed.");
		}
		
		return str;
	}

	public static void main(String[] args) {
		System.out.println("Please input your base pairs!");
		String value = input.next();
		obj.basePairs(value);
	}
}
