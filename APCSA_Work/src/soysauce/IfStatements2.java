package soysauce;
public class IfStatements2 {
	int HomeGoals;
	int GuestGoals;
	static int Points = 0; // aka home points
	
	public static int PointsUpdate(int HomeGoals, int GuestGoals) {
		
		if(HomeGoals > GuestGoals) {
			int HomeTeamWins = Points + 3;
			return HomeTeamWins;
		}
		else if(HomeGoals == GuestGoals) {
			int Tie = Points + 1;
			return Tie;
		}
		else if(HomeGoals < GuestGoals) {
			int GuestTeamWins = Points + 0;
			return GuestTeamWins;
			
		}
		else if(HomeGoals < 0 || GuestGoals < 0) {
			System.out.println("One or more of your entries were entered incorrectly.");
		}
			
		return Points;
	}
	
	
	
	public static void main(String[] args) {
		IfStatements2 HTW = new IfStatements2();
		System.out.println(HTW.PointsUpdate(-3, 2));

	}

}
