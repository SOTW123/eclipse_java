package newPackage;
import java.util.Scanner;
// ISSUES
// 1) HAS TO CONTAIN ALL 4 NUCLEOTIDES

// user inputs a strand of DNA/RNA and it converts to the oppoosite
// if user does not input augct then it should send error message
// if user goes over/under max base pairing or does not have correct 
// amount then it should say deletion has occured in strand
public class Basepairing {
	
	static Scanner input = new Scanner(System.in);
	
	
	public String basePairing(String basePairs) {
		StringBuilder string = new StringBuilder(basePairs);
		// Checks if length is correct
		int len = basePairs.length();
		if(len % 3 == 0) {
			System.out.println("The inputed value has the correct amount of base pairs...");
		}
		else {
			System.out.println("The inputed value has the wrong amount of base pairs...");
			return null;
		}
		// Checks if correct base pair Molecules
		if( (basePairs.contains("A") && basePairs.contains("A") && basePairs.contains("A")) ||
				(basePairs.contains("A") && basePairs.contains("A") && basePairs.contains("T")) || (basePairs.contains("A") && basePairs.contains("A") && basePairs.contains("C")) || (basePairs.contains("A") && basePairs.contains("A") && basePairs.contains("G")) || (basePairs.contains("T") && basePairs.contains("T") && basePairs.contains("T")) || (basePairs.contains("T") && basePairs.contains("T") && basePairs.contains("A")) || (basePairs.contains("T") && basePairs.contains("T") && basePairs.contains("C")) || (basePairs.contains("T") && basePairs.contains("T") && basePairs.contains("G")) || (basePairs.contains("C") && basePairs.contains("C") && basePairs.contains("C")) || (basePairs.contains("C") && basePairs.contains("C") && basePairs.contains("A")) || (basePairs.contains("C") && basePairs.contains("C") && basePairs.contains("T")) || (basePairs.contains("C") && basePairs.contains("C") && basePairs.contains("G")) || (basePairs.contains("G") && basePairs.contains("G") && basePairs.contains("G")) || (basePairs.contains("G") && basePairs.contains("G") && basePairs.contains("A")) || (basePairs.contains("G") && basePairs.contains("G") && basePairs.contains("T")) || (basePairs.contains("G") && basePairs.contains("G") && basePairs.contains("C")))
 {
			
			System.out.println("The inputed value has the correct molecules of base pairs...");
		}
		
		else if(!(basePairs.contains("A")) || !(basePairs.contains("T")) || !(basePairs.contains("C")) || !(basePairs.contains("G"))) {
			System.out.println("The inputed value has the wrong molecules of Nucleotide Bases");
			return null;
		}
		// Checks if RNA or DNA
		if(basePairs.contains("U") && basePairs.contains("T")) {
			System.out.println("Cannot contain both Uracil and Thymine!");
		}
		else if(basePairs.contains("U")) {
			System.out.println("This is a strand of RNA");
			int i = 0;
			int x = 1;
			while(i < len && x < len + 1) {
			if(basePairs.substring(i, x).equals("T")) {
		        string.setCharAt(i, 'A');
			}
			else if(basePairs.substring(i, x).equals("A")) {
		        string.setCharAt(i, 'U');
			}
			else if(basePairs.substring(i, x).equals("U")) {
		        string.setCharAt(i, 'A');
			}
			else if(basePairs.substring(i, x).equals("G")) {
		        string.setCharAt(i, 'C');
			}
			else if(basePairs.substring(i, x).equals("C")) {
		        string.setCharAt(i, 'G');
			}
			i++;
			x++;
			}
			System.out.println(string);
		}
		
		
		// Creates Anti-Codon for DNA
		else if(basePairs.contains("T")) {
			System.out.println("This is a strand of DNA");
			int i = 0;
			int x = 1;
			while(i < len && x < len + 1) {
				
				
				
			if(basePairs.substring(i, x).equals("T")) {
		        string.setCharAt(i, 'A');
			}
			else if(basePairs.substring(i, x).equals("A")) {
		        string.setCharAt(i, 'T');
			}
			else if(basePairs.substring(i, x).equals("G")) {
		        string.setCharAt(i, 'C');
			}
			else if(basePairs.substring(i, x).equals("C")) {
		        string.setCharAt(i, 'G');
			}
			i++;
			x++;
			}
				System.out.println(string);
				
		}
		return basePairs;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Type in your Base Pairs to get them reversed!");
		String userInput = input.next();
		Basepairing obj = new Basepairing();
		obj.basePairing(userInput);
	}

}
