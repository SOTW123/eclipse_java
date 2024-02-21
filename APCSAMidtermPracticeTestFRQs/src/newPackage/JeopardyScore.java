package newPackage;
import java.util.Scanner;

public class JeopardyScore {
	static Scanner input = new Scanner(System.in);
	// want to take user input of how many points to add to 
	// total points then print how many points after points added
	int counter; // used to count how many times for loop has ran
	
	public void Score() {
		System.out.println("How many points do you have currently?");
		int currPts = input.nextInt();
		
		System.out.println("How many points would you like to add?");
		int pointsToAdd = input.nextInt();
		currPts += pointsToAdd;
		
		for(int i = 0; i < 100; i++) {
		System.out.println("If you would like to add more points, type 'true'. If you would not like to add more points, type 'false'.");
		boolean repeat = input.nextBoolean();
		if(repeat == true) {
			System.out.println("How many more points would you like to add?");
			int newPointsToAdd = input.nextInt();
			currPts += newPointsToAdd;
			System.out.println(currPts);
		}
		else if(repeat == false) {
			System.out.println("Your current amount of points are: " + currPts + " ");
			break;
		}
		}
	}
	
	public static void main(String[] args) {
		JeopardyScore a = new JeopardyScore();
		a.Score();
		
	}
}
