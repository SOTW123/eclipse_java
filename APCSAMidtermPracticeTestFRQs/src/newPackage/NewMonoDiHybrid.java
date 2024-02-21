package newPackage;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class NewMonoDiHybrid {
	Thread thread = new Thread();
	Scanner input = new Scanner(System.in);
	
	private void Monohybrid () throws InterruptedException {
		/*
		thread.start();
		System.out.println("Do you want a cool 'loading' line? Type 'y' if so, or 'n' if not.");
		boolean loading = input.nextBoolean();
		String yesOrNo = input.next();
		
		if(yesOrNo.equals("y")) {
			String x = "";
			Thread.sleep(500);
			x = "L";
			System.out.print(x);
			Thread.sleep(500);
			x = "o";
			System.out.print(x);
			Thread.sleep(500);
			x = "a";
			System.out.print(x);
			Thread.sleep(500);
			x = "d";
			System.out.print(x);
			Thread.sleep(500);
			x = "i";
			System.out.print(x);
			Thread.sleep(500);
			x = "n";
			System.out.print(x);
			Thread.sleep(500);
			x = "g";
			System.out.print(x);
			Thread.sleep(500);
			x = ".";
			System.out.print(x);
			Thread.sleep(500);
			x = ".";
			System.out.print(x);
			Thread.sleep(500);
			x = ".";
			System.out.print(x + "\n" + "\n");
			Thread.sleep(1000);
			
			}
		else if(yesOrNo.equals("n")) {
			System.out.println("aight bet");
		}
		
		
		
		*/
			System.out.println("What are the first parent's gametes?"); // first parent
			String a = input.next();
				if(a.length() > 2 || a.length() < 2) {
				System.out.println("error"); 
				a = null;
				}
				if(a.substring(0, 1).contains(a.substring(1, 2))) {
					System.out.println("Ready!");
					
				}
				else {
					System.out.println("error");
				}
				
					
			System.out.println("What are the second parent's gametes?"); // second parent
			String b = input.next();
				if(b.length() > 2 || b.length() < 2) {
				System.out.println("error"); 
				b = null;
				}
				
				if(b.substring(0, 1).contains(b.substring(1, 2))) {
					System.out.println("Ready!");
				}
				else {
					System.out.println("error");
				}
				String a1 = a.substring(0, 1);
				String a2 = a.substring(1, 2);
				String b1 = b.substring(0, 1);
				String b2 = b.substring(1, 2);
				
				String p1 = b1 + a1;
				String p2 = b1 + a2;
				String p3 = b2 + a1;
				String p4 = b2 + a2;
				
			String[][] array = { {p1, p2},
								 {p3, p4}
			};
			if(p1.substring(0, 1).equals(a.substring(0, 1).toLowerCase())) {
				StringBuilder sb = new StringBuilder(p1);
				sb.reverse();
			}
			if(p1.substring(0, 1).equals(b.substring(0, 1).toLowerCase())) {
				StringBuilder sb = new StringBuilder(p1);
				sb.reverse();
			}
			
			System.out.println(Arrays.deepToString(array));
	}
	public static void main(String[] args) throws InterruptedException{
		NewMonoDiHybrid obj = new NewMonoDiHybrid();
		obj.Monohybrid();
		
		// input for if mono or di hybrid
		// if mono then 2d array is 2 x 2
			// ask the letter that would like to be used
				// ask the two parents gametes
					// is the first parent homo or heto
						// if homo then 
							// is the first parent dom or recc
					// is the second parent homo or heto
						// if homo then 
							// is the second parent dom or recc
		// then calculation and printing
		
		// if di then 2d array is 4 x 4
			// FIRST DO MONO
	}

}
