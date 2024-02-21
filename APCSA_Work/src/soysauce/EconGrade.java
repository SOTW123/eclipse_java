package soysauce;

public class EconGrade {
	// calculate if my econ grade is an A lol
	
	double EconTotalPoints = 825;
	double EconCurrentPoints = 705;
	char grade;
	
	public char EconGradeFr(double EconCurrentPoints, double EconTotalPoints) {
		System.out.println(EconCurrentPoints / EconTotalPoints);
		
	if(EconCurrentPoints / EconTotalPoints >= 0.89) {
		System.out.println("You got an A!!!");
		
	}
	else if(EconCurrentPoints / EconTotalPoints >= 0.8) {
		System.out.println("...smhhhhhhhhh");
		
	}
	return grade;
	}
	
	public static void main(String[] args) {
		EconGrade obj = new EconGrade();
		obj.EconGradeFr(795 + 96 + 100, 1000);
		obj.EconGradeFr(795 + 96 + 2, 1000);
	}

}
