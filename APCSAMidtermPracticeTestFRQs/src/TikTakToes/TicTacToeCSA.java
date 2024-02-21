package TikTakToes;

public class TicTacToeCSA extends TicTacToe{
	// mf obj for boolean meth
	// obj for other meth
	
	
	
	public static void main(String[] args) {
		System.out.println("Player 1 : Pick 'X' or 'O'");
			String temp1 = scan.next();
				if(temp1.equals("X") || temp1.equals("x")) {
					System.out.println("Player 1 is X. Player 2 is O.");
					
				} else if(temp1.equals("O") || temp1.equals("o")) {
					System.out.println("Player 1 is O. Player 2 is X.");
				} else System.out.println("wow i see how it is");
				
		
	}
}
