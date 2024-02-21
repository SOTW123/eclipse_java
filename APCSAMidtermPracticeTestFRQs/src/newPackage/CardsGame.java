package newPackage;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;
public class CardsGame {
		static Stack<Integer> STACK = new Stack<Integer>();
        static Random rand = new Random();
        static TestCardsGame obj = new TestCardsGame();
        private static String[] OrderedStack = {"1", "2", "3"};
		private static int[] randIndex = new int[OrderedStack.length];
        private String[] ShuffledStack;
        
        

/*
        public static String[] ShuffleDeck(String[] OrderedStack) {
        	// make array of random indexes
        	for(int i = 0; i < OrderedStack.length; i++) {
        		
        		int y = rand.nextInt(OrderedStack.length);
        		for(int x = 0; x < OrderedStack.length; x++) {
        		randIndex[x] = y;
        		System.out.println(randIndex[y]);
        		}
        	}
        	
        	
        	
        		
        		
        		
            return OrderedStack;
        }
*/
        public static void main(String[] args) {
        	int random = 0;
        	int x = 1;
        	int normalIndex[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        	int index[] = new int[OrderedStack.length];
        	int finalIndex[] = new int[OrderedStack.length];
        	
        	for(int i = 0; i < OrderedStack.length; i++) {
        		normalIndex[i] = i;
        	}
        	System.out.println(Arrays.toString(normalIndex));
        	
        	
        	for(int i = 0; i < OrderedStack.length; i++) {
        		random = rand.nextInt(OrderedStack.length);
        		index[i] = random;
        	}
        	for (int i = 1; i < OrderedStack.length; i++) {
				if(index[0] == i) {
					index[i] = rand.nextInt(OrderedStack.length);
					continue;
				}
				
				if(index[1] == i) {
					index[i] = rand.nextInt(OrderedStack.length);
					continue;
				}
				if(index[2] == i) {
					index[i] = rand.nextInt(OrderedStack.length);
				}
			}
        	System.out.println(Arrays.toString(index));
        }
}
        		
        			
        	
        	
           	
        	
        	
        	
        	
        	
        	
            

        



