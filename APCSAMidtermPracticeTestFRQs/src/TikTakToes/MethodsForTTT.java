package TikTakToes;

public class MethodsForTTT extends TicTacToe{

	/*
	private String[][] onePlayer_ticTacToe() {
		obj.printGameBoard(gameBoard);
		int[] counting = new int[9];
		ArrayList<Integer> choices = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			choices.add(i+1);
		}
		
		while(mf.winOrLose() == true) {
			int input = scan.nextInt();
			for (int i = 0; i < counting.length; i++) {
					if(input != choices.get(Integer.valueOf(input))) {
						System.out.println("error");
						continue;
					}
			}
			
			switch(input) {
			case 1 : gameBoard[0][0] = "X"; counting[0]++;  
				break;
			case 2 :  gameBoard[0][1] = "X"; counting[1]++;  
				break;
			case 3 :  gameBoard[0][2] = "X"; counting[2]++;  
				break;
			case 4 :  gameBoard[1][0] = "X"; counting[3]++;  
				break;
			case 5:  gameBoard[1][1] = "X"; counting[4]++;  
				break;
			case 6 :  gameBoard[1][2] = "X"; counting[5]++;  
				break;
			case 7 :  gameBoard[2][0] = "X"; counting[6]++;  
				break;
			case 8 :  gameBoard[2][1] = "X"; counting[7]++;  
				break;
			case 9 :  gameBoard[2][2] = "X"; counting[8]++;  
				break;
				}
			obj.printGameBoard(gameBoard);
			
			for (int i = 0; i < choices.size(); i++) {
				if(input == choices.get(input-1)) {
					System.out.println("error");
					switch(input) {
					case 1 : gameBoard[0][0] = " ";  
					break;
				case 2 :  gameBoard[0][1] = " ";  
					break;
				case 3 :  gameBoard[0][2] = " "; 
					break;
				case 4 :  gameBoard[1][0] = " "; 
					break;
				case 5:  gameBoard[1][1] = " "; 
					break;
				case 6 :  gameBoard[1][2] = " "; 
					break;
				case 7 :  gameBoard[2][0] = " "; 
					break;
				case 8 :  gameBoard[2][1] = " ";
					break;
				case 9 :  gameBoard[2][2] = " ";
					break;
					}
					continue;
				}
			}
			int botInput = rand.nextInt(0, 9);
			switch(botInput) {
			case 1 : gameBoard[0][0] = "X"; counting[0]++; 
			break;
		case 2 :  gameBoard[0][1] = "X"; counting[1]++; 
			break;
		case 3 :  gameBoard[0][2] = "X"; counting[2]++; 
			break;
		case 4 :  gameBoard[1][0] = "X"; counting[3]++;  
			break;
		case 5:  gameBoard[1][1] = "X"; counting[4]++;  
			break;
		case 6 :  gameBoard[1][2] = "X"; counting[5]++;  
			break;
		case 7 :  gameBoard[2][0] = "X"; counting[6]++;  
			break;
		case 8 :  gameBoard[2][1] = "X"; counting[7]++;  
			break;
		case 9 :  gameBoard[2][2] = "X"; counting[8]++;  
			break;
			}
			for (int i = 0; i < choices.size(); i++) {
				if(input != choices.get(Integer.valueOf(input))) {
					System.out.println("error");
					switch(botInput) {
					case 1 : gameBoard[0][0] = " ";  
					break;
				case 2 :  gameBoard[0][1] = " ";  
					break;
				case 3 :  gameBoard[0][2] = " "; 
					break;
				case 4 :  gameBoard[1][0] = " "; 
					break;
				case 5:  gameBoard[1][1] = " "; 
					break;
				case 6 :  gameBoard[1][2] = " "; 
					break;
				case 7 :  gameBoard[2][0] = " "; 
					break;
				case 8 :  gameBoard[2][1] = " ";
					break;
				case 9 :  gameBoard[2][2] = " ";
					break;
					}
					continue;
				}
		}
			obj.printGameBoard(gameBoard);
		}
		
		return gameBoard;
}
*/
}
