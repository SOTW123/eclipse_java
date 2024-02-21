package soysauce;
public class IfStatements {
	
	
	public static void AgeAbility(int Age) {
		if(Age >= 14) {
			System.out.println("Can Work");
		}
		if(Age >= 15) {
			System.out.println("Can Travel");
		}
		if(Age >= 16) {
			System.out.println("Can Drive");
		}
		if(Age >= 18) {
			System.out.println("Can Vote, Can Marry, and Can Buy a House");
		}
		if(Age >= 35) {
			System.out.println("Can be nominated as a President");
		}
		if(Age >= 62) {
			System.out.println("Can retire Early");
		}
		if(Age >= 65) {
			System.out.println("Can retire");
		} 
		if(Age < 0) {
			System.out.println("The age was entered incorrectly!");
		}
	}
	
	public static void main(String[] args) {
		AgeAbility(70);
	}
	
	
	
	
	}
