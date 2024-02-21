package connect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ConnectFour extends Errors {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static ConnectFour obj = new ConnectFour();
	static String[][] gameBoard = {
			{"  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  "}
	};
	
	// 5 * 6
	static void printGameBoard(String[][] array) {
		System.out.print("__________________________________");
		for (String[] strings : array) {
			System.out.println();
			
			for (String string : strings) {
				System.out.print(string + " | ");
			}
		}
		System.out.println("\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		System.out.println(" 1    2    3    4    5    6    7");
	}
	private String[][] connectFour() {
		printGameBoard(gameBoard);
			int rowCount[] = {5, 5, 5, 5, 5, 5, 5};
			int input = 0;
			int i = 0; // counter
			
			while(winOrLose(gameBoard) == false) {
				if(i % 2 == 0) {
					input = scan.nextInt();
					switch(input) {
							case 1 : gameBoard[rowCount[0]][0] = "⚫"; rowCount[0]--; break;
							case 2 : gameBoard[rowCount[1]][1] = "⚫"; rowCount[1]--;  break;
							case 3 : gameBoard[rowCount[2]][2] = "⚫"; rowCount[2]--;  break;
							case 4 : gameBoard[rowCount[3]][3] = "⚫"; rowCount[3]--;  break;
							case 5 : gameBoard[rowCount[4]][4] = "⚫"; rowCount[4]--;  break;
							case 6 : gameBoard[rowCount[5]][5] = "⚫"; rowCount[5]--;  break;
							case 7 : gameBoard[rowCount[6]][6] = "⚫"; rowCount[6]--;  break;
					}
					printGameBoard(gameBoard);
				}
				else if(i % 2 != 0) {
					input = scan.nextInt();
					switch(input) {
					case 1 : gameBoard[rowCount[0]][0] = "🔵"; rowCount[0]--; break;
					case 2 : gameBoard[rowCount[1]][1] = "🔵"; rowCount[1]--;  break;
					case 3 : gameBoard[rowCount[2]][2] = "🔵"; rowCount[2]--;  break;
					case 4 : gameBoard[rowCount[3]][3] = "🔵"; rowCount[3]--;  break;
					case 5 : gameBoard[rowCount[4]][4] = "🔵"; rowCount[4]--;  break;
					case 6 : gameBoard[rowCount[5]][5] = "🔵"; rowCount[5]--;  break;
					case 7 : gameBoard[rowCount[6]][6] = "🔵"; rowCount[6]--;  break;
				
			}
					printGameBoard(gameBoard);
				}	
				i++;
			}	
		return gameBoard;
	}
	private static boolean winOrLose(String[][] array) {
		
		String[] sumArrHorz = {"", "", "", "", "", "", ""};
		// horizontal
			for (int i = 0; i < gameBoard.length; i++) {
				for (int j = 0; j < gameBoard[i].length; j++) {
					sumArrHorz[i] += array[i][j];
				}
			}
				// horizontal testing
			for (int i = 0; i < sumArrHorz.length; i++) {
				if(sumArrHorz[i].contains("🔵🔵🔵🔵")) {
					System.out.println("🔵 Wins!");
					return true;

				} 
				else if(sumArrHorz[i].contains("⚫⚫⚫⚫")) {
					System.out.println("⚫ Wins!");
					return true;
				}
			}
			
			
		// vertical
			String[] sumArrVert = {"", "", "", "", "", "", ""};
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 6; j++) {
					sumArrVert[i] += array[j][i];
				}
			}
		// vertical testing
			for (int i = 0; i < sumArrVert.length; i++) {
				if(sumArrVert[i].contains("🔵🔵🔵🔵")) {
					System.out.println("🔵 Wins!");
					return true;

				} 
				else if(sumArrVert[i].contains("⚫⚫⚫⚫")) {
					System.out.println("⚫ Wins!");
					return true;
				}
			}
		
		
		// diagonal 
			
		String[] firstDiagSum = {"", "", "", "", "", ""};
				for (int i = 0; i < firstDiagSum.length; i++) {
					switch(i) {
						case 0 : 
							for (int j = 0; j < 6; j++) {
								firstDiagSum[0] += array[j][j];
							}
							break;
						case 1 : 
							for (int j = 0; j < 6; j++) {
								firstDiagSum[1] += array[j][j+1];
							}
							break;
						case 2 : 
							for (int j = 0; j < 5; j++) {
								firstDiagSum[2] += array[j+1][j];
							}
							break;
						case 3 : 
							for (int j = 0; j < 4; j++) {
								firstDiagSum[3] += array[j+2][j];
							}
							break;
						case 4: 
							for (int j = 0; j < 5; j++) {
								firstDiagSum[4] += array[j][j+2];
							}
							break;
						case 5: 
							for (int j = 0; j < 4; j++) {
								firstDiagSum[5] += array[j][j+3];
							}
							break;
					}
				}
					String[] secondDiagSum = {"", "", "", "", "", ""};
					int j = 0;
					for (int k = 0; k < secondDiagSum.length; k++) {
						switch(k) {
							case 0 : 
									j = 6;
									for (int i = 0; i < secondDiagSum.length; i++) {
										secondDiagSum[0] += array[i][j];
										
										j--;
									}
							break;
							
							case 1 : 
								j = 5;
								for (int i = 0; i < secondDiagSum.length; i++) {
									secondDiagSum[1] += array[i][j];
									
									j--;
								}
							break;
							
							case 2 : 
								j = 6;
								for (int i = 0; i < 5; i++) {
									secondDiagSum[2] += array[i+1][j];
									
									j--;
								}
								break;
								
							case 3 : 
								j = 6;
								for (int i = 0; i < 4; i++) {
									secondDiagSum[3] += array[i+2][j];
									
									j--;
								}
								break;
								
							case 4 : 
								j = 4;
								for (int i = 0; i < 5; i++) {
									secondDiagSum[4] += array[i][j];
									
									j--;
								}
								break;
							
							case 5 : 
								j = 3;
								for (int i = 0; i < 4; i++) {
									secondDiagSum[5] += array[i][j];
									
									j--;
								}
								break;
						}
					}
					
					// vertical checking
					for (int i = 0; i < secondDiagSum.length; i++) {
						if(firstDiagSum[i].contains("🔵🔵🔵🔵")) {
							System.out.println("🔵 Wins!");
							return true;
						}
						else if(firstDiagSum[i].contains("⚫⚫⚫⚫")) {
							System.out.println("⚫ Wins!");
						}
					}
					for (int i = 0; i < secondDiagSum.length; i++) {
						if(secondDiagSum[i].contains("🔵🔵🔵🔵")) {
							System.out.println("🔵 Wins!");
							return true;
						} 
						else if(secondDiagSum[i].contains("⚫⚫⚫⚫")) {
							System.out.println("⚫ Wins!");
							return true;
						}
					}
				
		return false;
	}
	private String[][] botConnectFour() throws ArrayIndexOutOfBoundsException {
		printGameBoard(gameBoard);
		ArrayList<Integer> options = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
		System.out.println(options.toString());
		int rowCount[] = {5, 5, 5, 5, 5, 5, 5};
		int rowsLeft[] = {6, 6, 6, 6, 6, 6, 6};
		int input = 0;
		int i = 0; // counter
		
		
		while(winOrLose(gameBoard) == false) {
			if(i % 2 == 0) {
				input = scan.nextInt();
				switch(input) {
						case 1 : gameBoard[rowCount[0]][0] = "⚫"; rowsLeft[0]--; rowCount[0]--; break;
						case 2 : gameBoard[rowCount[1]][1] = "⚫"; rowsLeft[1]--; rowCount[1]--;   break;
						case 3 : gameBoard[rowCount[2]][2] = "⚫"; rowsLeft[2]--; rowCount[2]--;   break;
						case 4 : gameBoard[rowCount[3]][3] = "⚫"; rowsLeft[3]--; rowCount[3]--;   break;
						case 5 : gameBoard[rowCount[4]][4] = "⚫"; rowsLeft[4]--; rowCount[4]--;   break;
						case 6 : gameBoard[rowCount[5]][5] = "⚫"; rowsLeft[5]--; rowCount[5]--;   break;
						case 7 : gameBoard[rowCount[6]][6] = "⚫"; rowsLeft[6]--; rowCount[6]--;   break;
				}
				System.out.println("This is rowCount" + Arrays.toString(rowCount));
				System.out.println("This is rowsLeft" + Arrays.toString(rowsLeft));
				System.out.println("This is options" + options.toString());
				printGameBoard(gameBoard);
			}
			else if(i % 2 != 0) {
				
				input = rand.nextInt(options.get(0), options.get(options.size()-1));
				switch(input) {
				case 1 : gameBoard[rowCount[0]][0] = "🔵"; rowsLeft[0]--; rowCount[0]--;  break;
				case 2 : gameBoard[rowCount[1]][1] = "🔵"; rowsLeft[1]--; rowCount[1]--;   break;
				case 3 : gameBoard[rowCount[2]][2] = "🔵"; rowsLeft[2]--; rowCount[2]--;   break;
				case 4 : gameBoard[rowCount[3]][3] = "🔵"; rowsLeft[3]--; rowCount[3]--;   break;
				case 5 : gameBoard[rowCount[4]][4] = "🔵"; rowsLeft[4]--; rowCount[4]--;   break;
				case 6 : gameBoard[rowCount[5]][5] = "🔵"; rowsLeft[5]--; rowCount[5]--;   break;
				case 7 : gameBoard[rowCount[6]][6] = "🔵"; rowsLeft[6]--; rowCount[6]--;   break;
		}
				System.out.println("This is rowCount" + Arrays.toString(rowCount));
				System.out.println("This is rowsLeft" + Arrays.toString(rowsLeft));
				System.out.println("This is options" + options.toString());
				for (int j = 0; j < rowsLeft.length; j++) {
					if(rowsLeft[j] == 0) {
						options.remove(Integer.valueOf(j+1));
						System.out.println(options.toString());
					}
				}
				
				printGameBoard(gameBoard);
			}	
			i++;
		}	
		
		return gameBoard;
	}
	
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		System.out.println("Press 1 for One-Player, 2 for Two-Player");
		int inp = scan.nextInt();
			if(inp == 1) {
					System.out.println("Select Difficulty Level");
					System.out.println("	- Easy");
					System.out.println("	- Hard");
					 String input = scan.next();
					 	if(input.equals("Easy") || input.equals("easy")) {
					 		obj.botConnectFour();
					 		}
					 	else if(input.equals("Hard") || input.equals("hard")) System.out.println("Still working on that! Why not check out the easy mode instead?"); return;// YKYK
				}
			else if(inp == 2) obj.connectFour();
			
		obj.botConnectFour();

	}

}
