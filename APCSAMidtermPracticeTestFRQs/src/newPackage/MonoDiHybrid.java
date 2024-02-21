package newPackage;
import java.util.Arrays;
import java.util.Scanner; 

public class MonoDiHybrid {
	static MonoDiHybrid obj = new MonoDiHybrid();
	static Scanner input = new Scanner(System.in);
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
	
	
	// MONOHYBRID
	 char[][] MonoHybrid() {
		 // Asks user what letter would like to be used
				System.out.println("What letter would you like to use?");
				String Gamete = input.next();	
				if(Gamete.length() >= 2) {
					System.out.println("Length of 'Letter' is too long you stupid bum I ASKED FOR A GODDAMN LETTER YOU BUM");
				}
				// exclude numbers
				
			// First parent
			System.out.println("Does the first parent have Homozygous or Heterozygous Gametes?");
			String HomoOrHetero = input.next();
				if(HomoOrHetero.equals("Homozygous") || HomoOrHetero.equals("homozygous")) {
					System.out.println("Is this gamete Dominant or Recessive");
					String DomOrRecc = input.next();
					if(DomOrRecc.equals("Dominant") || DomOrRecc.equals("dominant")) {
						String DomGamete = Gamete.toUpperCase();
						String[] FinalGamete = {Gamete, Gamete}; // Final Gamete to be used // DOM
						
					}
					else if(DomOrRecc.equals("Recessive") || DomOrRecc.equals("recessive")) {
						String ReccGamete = Gamete.toLowerCase();
						String[] FinalGamete = {Gamete, Gamete}; // Final Gamete to be used // RECC
						
					}
				
					
					
				else if(HomoOrHetero.equals("Heterozygous") || HomoOrHetero.equals("heterozygous")) {
					String DomGamete = Gamete.toUpperCase();
					String ReccGamete = Gamete.toLowerCase();
					String[] FinalGamete = {DomGamete, ReccGamete}; //Final Gamete to be used
				}
			// Second parent
				System.out.println("Does the second parent have Homozygous or Heterozygous Gametes?");
				String HomoOrHeteroII = input.next();
				if(HomoOrHeteroII.equals("Homozygous") || HomoOrHeteroII.equals("homozygous")) {
					System.out.println("Is this gamete Dominant or Recessive");
					String DomOrReccII = input.next();
					if(DomOrReccII.equals("Dominant") || DomOrReccII.equals("dominant")) {
						String DomGameteII = Gamete.toUpperCase();
						String[] FinalGameteII = {Gamete, Gamete}; // Final Gamete to be used // DOM
					}
					else if(DomOrReccII.equals("Recessive") || DomOrReccII.equals("recessive")) {
						String ReccGameteII = Gamete.toLowerCase();
						String[] FinalGameteII = {Gamete, Gamete}; // Final Gamete to be used // RECC
					}
				}
				else if(HomoOrHeteroII.equals("Heterozygous") || HomoOrHeteroII.equals("heterozygous")) {
					String DomGameteII = Gamete.toUpperCase();
					String ReccGameteII = Gamete.toLowerCase();
					String[] FinalGameteII = {DomGameteII, ReccGameteII}; //Final Gamete to be used
			
				
			String MonoHybrid[][] = new String[2][2];
			MonoHybrid[0][0] = FinalGamete[0] + FinalGameteII[0];
			MonoHybrid[0][1] = FinalGamete[1] + FinalGameteII[0];
			MonoHybrid[1][0] = FinalGamete[0] + FinalGameteII[1];
			MonoHybrid[1][1] = FinalGamete[1] + FinalGameteII[1];
			System.out.println(Arrays.deepToString(MonoHybrid));
				}
				}
				
				
				
	
			
		
		
			
			return MonoHybrid();
	}
	
	 
	
	
	public static void main(String[] args) {
		obj.MonoHybrid();
		
	}
	
	
}
