package TikTakToes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static TicTacToe obj = new TicTacToe();
	static Scanner scan = new Scanner(System.in);
	
	static String[][] gameBoard = {
			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}
	};
	
	
	public void printGameBoard(String[][] array) {
		System.out.println(array[0][0] + " | " + array[0][1] + " | " + array[0][2]);
		System.out.println("--+---+--");
		System.out.println(array[1][0] + " | " + array[1][1] + " | " + array[1][2]);
		System.out.println("--+---+--");
		System.out.println(array[2][0] + " | " + array[2][1] + " | " + array[2][2]);
	}
	boolean game_state() {
		// horizontal
			// explanation : 
			String[] totalHorz = {"", "", ""};
			for (int i = 0; i < gameBoard.length; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					totalHorz[i] += gameBoard[i][j];
				}
				
			}
				for (int i = 0; i < totalHorz.length; i++) {
					if(totalHorz[i].equals("XXX")) {
						System.out.println("X Wins!");
						return false;
					}
					else if(totalHorz[i].equals("OOO")) {
						System.out.println("O Wins!");
						return false;
					}
						
				}
		// vertical 
				// explanation: 
				String[] totalVert = {"", "", ""};
				for (int i = 0; i < gameBoard.length; i++) {
					for (int j = 0; j < gameBoard[i].length; j++) {
						totalVert[i] += gameBoard[j][i];
					}
				}
					for (int i = 0; i < totalHorz.length; i++) {
						if(totalVert[i].equals("XXX")) {
							System.out.println("X Wins!");
							return false;
						}
						else if(totalVert[i].equals("OOO")) {
							System.out.println("O Wins!");
							return false;
						}
							
					}	
		// diagonal 1 
					// explanation
				String totalDiag = "";
			for (int i = 0; i < 3; i++) {
				totalDiag += gameBoard[i][i];
			}
				if(totalDiag.equals("XXX")) {
					System.out.println("X Wins!");
					return false;
				}
				else if(totalDiag.equals("OOO")) {
					System.out.println("O Wins!");
					return false;
				}
		// diagonal 2
				// explanation
			String secondDiag = "";
			int j = 2;
			for (int i = 0; i < gameBoard.length; i++) {
				secondDiag += gameBoard[i][j];
				j--;
			}
			if(secondDiag.equals("XXX")) {
				System.out.println("X Wins!");
				return false;
			}
			else if(secondDiag.equals("OOO")) {
				System.out.println("O Wins!");
				return false;
			}
		return true;
	}
	
	
	private String[][] twoPlayer_ticTacToe() {
		
		
		return gameBoard;
	}

	
	
	public static void main(String[] args) {
		String[][] instruction = {
				{"1", "2", "3"},
				{"4", "5", "6"},
				{"7", "8", "9"}
		};
		System.out.println("Welcome! This is a Tic-Tac-Toe Game made in Java.");
		System.out.println("    I'm here to help you relive your childhood.");
		System.out.println("---------------------------------------------------");
		System.out.println("Here are your instructions: ");
		System.out.println("    - Do not repeat numbers ");
		System.out.println("    - The game works like this: ");
		obj.printGameBoard(instruction);
			// room for more rools
		System.out.println();
		System.out.println("---------------------------------------------------" + "\n");
		
		
		 obj.twoPlayer_ticTacToe(); // Two-Player IRL
		// obj.onePlayer_ticTacToe(); // One player with bot *with different difficulty levels
		// winOrLose();
	}
}