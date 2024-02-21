package newPackage;

import java.util.Arrays;

import java.util.Random;
public class TestCardsGame {
	static Random rand = new Random();
	static TestCardsGame obj = new TestCardsGame();
	private static String[] OrderedStack = {"1s", "2h", "3d", "4s", "Ace", "2s", "3s","5h","8d", "9d"};
	private String[] ShuffledStack;
	
	
	public static String[] ShuffleDeck(String[] OrderedStack) {
		
		for (int i = 0; i < OrderedStack.length; i++) {
			int random = rand.nextInt(OrderedStack.length);
			String temp = OrderedStack[random];
			OrderedStack[random] = OrderedStack[i];
			OrderedStack[i] = temp;
			
		}
		System.out.println(Arrays.deepToString(OrderedStack));
	}
		
		public static boolean CompareCards(String Card1, String Card2) {
		    String card1 = ShuffleDeck.get(Card1).split(" ")[0];
		    String card2 = ShuffleDeck.get(Card2).split(" ")[0];
		    if (card1.compareTo(card2) > 0) {
		        return true;
		    } else {
		        return false;
		    }
		} {
	
		
		
		
		
		
		
		return OrderedStack;
	}
	
	public static void main(String[] args) {
		obj.ShuffleDeck(OrderedStack);
		
	}
}
