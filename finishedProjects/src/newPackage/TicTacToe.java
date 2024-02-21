package newPackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TicTacToe extends finishedMethods {
	static TicTacToe obj = new TicTacToe();
	static finishedMethods meth = new finishedMethods();
	static Scanner scan = new Scanner(System.in);
		
	
	static String[][] gameBoard = {
			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}
		};
	
	public String firstPlayer;
	public String secondPlayer;
								// remove parameters from this method
	public static void game_board() {
		System.out.println(gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2]);
		System.out.println("--+---+--");
		System.out.println(gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2]);
		System.out.println("--+---+--");
		System.out.println(gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2]);
	}
	
	
	void player_turns(int playerNum, String sign) {
		if(playerNum == 1) {
			if(sign.equals("X")) {
				firstPlayer = "X";
				secondPlayer = "O";
			}
			else if(sign.equals("O")) {
				firstPlayer = "O";
				secondPlayer = "X";
			} else {
				System.out.println("There's only \"X\" and \"O\"");
			}
		} else if(playerNum == 2) {
			if(sign.equals("X")) {
				firstPlayer = "O";
				secondPlayer = "X";
			}
			else if(sign.equals("O")) {
				firstPlayer = "X";
				secondPlayer = "O";
			} else {
				System.out.println("There's only \"X\" and \"O\"");
			}
		} else {
			System.out.println("There are only two players.");
			System.out.println("	* 1 for Player 1");
			System.out.println("	* 2 for Player 2");
		}
		
		System.out.println("First player sign: " + firstPlayer); 
		System.out.println("Second player sign: " + secondPlayer);
	}
	
	// Implement the method player_moves: The method should assign the sign (X or O) 
	// to the location picked by the player. The method takes the player number and the 
	// location as arguments and it shall update the 2D array game Board. The method has 
	// to ensure that the selected location isn’t filled previously, in that case it will 
	// ask the player to “Choose a Valid Location”. (20 Points)
boolean locationFilledFirstPlayer = false;
boolean locationFilledSecondPlayer = false;
	void player_moves( int playerNumber, int location) {
		if(playerNumber == 1) {
			switch(location) {
			case 1: if(gameBoard[0][0].contains("X") || gameBoard[0][0].contains("O")) {
					System.out.println("Please select a valid location!");
					locationFilledSecondPlayer = true;
						break;
					} else { gameBoard[0][0] = firstPlayer; }
					break;
					
			case 2: 
				if(gameBoard[0][1].contains("X") || gameBoard[0][1].contains("O")) {
					locationFilledSecondPlayer = true;
					System.out.println("Please select a valid location!");
					break;
				} else { gameBoard[0][1] = firstPlayer; }
			break;
			
			case 3: if(gameBoard[0][2].contains("X") || gameBoard[0][2].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[0][2] = firstPlayer;  }
		break;
		
			case 4: if(gameBoard[1][0].contains("X") || gameBoard[1][0].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[1][0] = firstPlayer;  }
		break;
		
			case 5: if(gameBoard[1][1].contains("X") || gameBoard[1][1].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[1][1] = firstPlayer;  }
		break;
		
			case 6: if(gameBoard[1][2].contains("X") || gameBoard[1][2].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[1][2] = firstPlayer;  }
		break;
		
			case 7: if(gameBoard[2][0].contains("X") || gameBoard[2][0].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[2][0] = firstPlayer;  }
		break;
		
			case 8: if(gameBoard[2][1].contains("X") || gameBoard[2][1].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[2][1] = firstPlayer; }
		break;
		
			case 9: if(gameBoard[2][2].contains("X") || gameBoard[2][2].contains("O")) {
				locationFilledSecondPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[2][2] = firstPlayer;  }
		break;
		
		}
		} else if(playerNumber == 2) {
			switch(location) {
			case 1: if(gameBoard[0][0].contains("X") || gameBoard[0][0].contains("O")) {
				locationFilledFirstPlayer = true;
					System.out.println("Please select a valid location!");
						break;
					} else { gameBoard[0][0] = secondPlayer; }
					break;
					
			case 2: 
				if(gameBoard[0][1].contains("X") || gameBoard[0][1].contains("O")) {
					locationFilledFirstPlayer = true;
					System.out.println("Please select a valid location!");
					break;
				} else { gameBoard[0][1] = secondPlayer; }
			break;
			
			case 3: if(gameBoard[0][2].contains("X") || gameBoard[0][2].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[0][2] = secondPlayer;  }
		break;
		
			case 4: if(gameBoard[1][0].contains("X") || gameBoard[1][0].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[1][0] = secondPlayer;  }
		break;
		
			case 5: if(gameBoard[1][1].contains("X") || gameBoard[1][1].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[1][1] = secondPlayer;  }
		break;
		
			case 6: if(gameBoard[1][2].contains("X") || gameBoard[1][2].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[1][2] = secondPlayer;  }
		break;
		
			case 7: if(gameBoard[2][0].contains("X") || gameBoard[2][0].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[2][0] = secondPlayer;  }
		break;
		
			case 8: if(gameBoard[2][1].contains("X") || gameBoard[2][1].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[2][1] = secondPlayer; }
		break;
		
			case 9: if(gameBoard[2][2].contains("X") || gameBoard[2][2].contains("O")) {
				locationFilledFirstPlayer = true;
				System.out.println("Please select a valid location!");
				break;
			} else { gameBoard[2][2] = secondPlayer;  }
		break;
		
		}
		}
		
		
		game_board();
	}
	
	
	private static boolean game_state() {
		// horizontally *done*
		
		String[] horizontal = {"","",""};
			for (int i = 0; i < gameBoard.length; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					horizontal[i] += gameBoard[i][j];
				}
			}
		
		for (int i = 0; i < horizontal.length; i++) {
			if(horizontal[i].equals("XXX")) {
				System.out.println("\"X\" Wins!");
				return true;
			}
			else if(horizontal[i].equals("OOO")) {
				System.out.println("\"O\" Wins!");
				return true;
			}
			
		}
		
		
		// vertically *done*
		
		String[] vertical = {"","",""};
			for (int i = 0; i < gameBoard.length; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					vertical[i] += gameBoard[j][i];
				}
			}
		
		for (int i = 0; i < vertical.length; i++) {
			if(vertical[i].equals("XXX")) {
				System.out.println("\"X\" Wins!");
				return true;
			}
			else if(vertical[i].equals("OOO")) {
				System.out.println("\"O\" Wins!");
				return true;
			}
		}
		
		
		// diagonally
		
		String[] diagonal = {"", ""};
		
			for (int i = 0; i < gameBoard.length; i++) {
					diagonal[0] += gameBoard[i][i];
			}
			
			
			
			if(diagonal[0].equals("XXX")) {
				System.out.println("\"X\" Wins!"); 
				return true;
			}
			else if(diagonal[0].equals("OOO")) {
				System.out.println("\"O\" Wins!"); 
				return true;
			}
		
		for (int i = 2, j=0; j < gameBoard.length; i--, j++) {
			diagonal[1] += gameBoard[i][j];
		}
		if(diagonal[1].equals("XXX")) {
			System.out.println("\"X\" Wins!"); 
			return true;
		}
		else if(diagonal[1].equals("OOO")) {
			System.out.println("\"O\" Wins!"); 
			return true;
		}
		
		int counter = 0;
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard.length; j++) {
				if(gameBoard[i][j].contains("X") || gameBoard[i][j].contains("O")) {
					counter++;
				}
			}
		}
			if(counter == 9) {
				System.out.println("The game has ended in a draw");
				return true;
			}
		
		// default is false
		return false;
	}
	
	void game() {
		int i = 1;
			while(!game_state()) {
				int input = scan.nextInt();
				if(input < 1 || input > 9) {
					System.out.println("Please select a valid number");
					continue;
				} 
					obj.player_moves(i, input);
				if(i==2) i=0;
				
					
				i++;
				if(locationFilledFirstPlayer == true) {
					i = 2;
					locationFilledFirstPlayer = false;
				} 
				if(locationFilledSecondPlayer == true) {
					i = 1;
					locationFilledSecondPlayer = false;
				}
			}
		
	}
		
	public static void main(String[] args) {
		
		game_board();
		obj.player_turns(1,"X");
		obj.game();
		
		
	}

}
