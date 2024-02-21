package soysauce;
public class IfStatementsNew {
	
	String LegalAbility = "";
	
	public String AgeAbility(int Age) {
		if(Age >= 14) {
			LegalAbility += "Can Work\n";
		}
		if(Age >= 15) {
			 LegalAbility += "Can Travel\n";
		}
		if(Age >= 16) {
			LegalAbility += "Can Drive\n";
		}
		if(Age >= 18) {
			LegalAbility += "Can Vote, Can Marry, and Can Buy a House\n"; 
		}
		if(Age >= 35) {
			LegalAbility += "Can be nominated as a President\n";
		}
		if(Age >= 62) {
			LegalAbility += "Can retire Early\n";
		}
		if(Age >= 65) {
			LegalAbility += "Can retire\n";
		} 
		if(Age < 0) {
			LegalAbility += "Your Age has been entered incorrectly!\n";
		}
		return LegalAbility;
	}
	
	public static void main(String[] args) {
		IfStatementsNew obj = new IfStatementsNew();
		System.out.println(obj.AgeAbility(70));
	}
	
	
	
	
	}
