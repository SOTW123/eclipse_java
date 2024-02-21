package newPackage;
	import java.util.Arrays;
	import java.util.Scanner;
public class DiHybridCross {
		static Scanner input = new Scanner(System.in);
		String[] listOfGametes = {"AABB", "AABb", "AAbb", "AaBB", "AaBb", "Aabb", "aaBB", "aaBb", "aabb"};
		String[][] PunnetSquare = new String[4][4];
			String OneParGam = null;
			String TwoParGam = null;
			
		private void Dihybrid(String[][] array) {
				// SETTING, GETTING INFO
			System.out.println("What are the first parents' gametes?"); // First parent
				System.out.println("List of Gametes: " + Arrays.deepToString(listOfGametes));
				System.out.println("                   0     1     2      3     4     5     6     7    8");
				System.out.println("                Select gametes based on number. Type the number needed.");
				
						int a_index = input.nextInt();
							switch(a_index) {
								case 0: OneParGam = listOfGametes[0];
										break;
								case 1: OneParGam = listOfGametes[1];
										break;
								case 2: OneParGam = listOfGametes[2];
										break;
								case 3: OneParGam = listOfGametes[3];
										break;
								case 4: OneParGam = listOfGametes[4];
										break;
								case 5: OneParGam = listOfGametes[5];
										break;
								case 6: OneParGam = listOfGametes[6];
										break;
								case 7: OneParGam = listOfGametes[7];
										break;
								case 8: OneParGam = listOfGametes[8];
										break;
							}
				
					System.out.println("\n");
				
			System.out.println("What are the second parents' gametes?"); // Second parent
				System.out.println("List of Gametes: " + Arrays.deepToString(listOfGametes));
				System.out.println("                   0     1     2      3     4     5     6     7    8");
				System.out.println("                Select gametes based on number. Type the number needed.");
					
				int b_index = input.nextInt();
				switch(b_index) {
					case 0: TwoParGam = listOfGametes[0];
						break;
					case 1: TwoParGam = listOfGametes[1];
						break;
					case 2: TwoParGam = listOfGametes[2];
						break;
					case 3: TwoParGam = listOfGametes[3];
						break;
					case 4: TwoParGam = listOfGametes[4];
						break;
					case 5: TwoParGam = listOfGametes[5];
						break;
					case 6: TwoParGam = listOfGametes[6];
						break;
					case 7: TwoParGam = listOfGametes[7];
						break;
					case 8: TwoParGam = listOfGametes[8];
						break;
				}
				
					// WORK
						// first parent
				String a = OneParGam.substring(0,1);
				String b = OneParGam.substring(1,2);
				String c = OneParGam.substring(2,3);
				String d = OneParGam.substring(3,4);
						// second parent
				String e = TwoParGam.substring(0,1);
				String f = TwoParGam.substring(1,2);
				String g = TwoParGam.substring(2,3);
				String h = TwoParGam.substring(3,4);
				
						// FOIL
				String[] OneParPlaces = {a+c, a+d, b+c, b+d};
				String[] TwoParPlaces = {e+g, e+h, f+g, f+h};
		
		System.out.println("----------------------------------------------------------");
		
			for (int i = 0; i < TwoParPlaces.length; i++) {
					int firstIndex = i;
				for (int j = 0; j < TwoParPlaces.length; j++) {
						int secondIndex = j;
					PunnetSquare[i][j] = OneParPlaces[j].substring(0, 1) + TwoParPlaces[i].substring(0, 1) + OneParPlaces[j].substring(1, 2) + TwoParPlaces[i].substring(1, 2);
				}
			}
			
			// setting by uppercase first then lowercase after
			// for loop
				// if statement
					// if ( contains lowercase letter in index 0 or index 2, reverse with the letter in front of it.)
			
			
				// Final Printing
			for (int i = 0; i < 4; i++) {
				System.out.print("    " + OneParPlaces[i]);
		}
				
			for (int i = 0; i < 4; i++) {
					
				System.out.println("\n");
					for (int j = 0; j < TwoParPlaces.length; j++) {
						if(j == 0) System.out.print(TwoParPlaces[i] + " ");
							char[] charArray = PunnetSquare[i][j].toCharArray();
						if(Character.isLowerCase(charArray[0])) {
							String str = PunnetSquare[i][j];
							String x = str.replace("aA", "Aa");
							PunnetSquare[i][j] = x;
					} 
						if(Character.isLowerCase(charArray[2])) {
							String str = PunnetSquare[i][j];
							String x = str.replace("bB", "Bb");
							PunnetSquare[i][j] = x;
					}
						System.out.print(PunnetSquare[i][j] + "  ");
					}
				
			}
			System.out.println("\n" + "----------------------------------------------------------");
		}	
		
			private void GenoRatios() {
				System.out.println("Genotypic Ratios: ");
				
				int[] counting = new int[9];
				
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						for (int j2 = 0; j2 < counting.length; j2++) {
							if(PunnetSquare[i][j].equals(listOfGametes[j2])) {
								counting[j2]++;
							}
						}
						
					}
				}
				
				
				for (int i = 0; i < counting.length; i++) {
					System.out.print("  " + counting[i] + ",  ");
				}
					System.out.println("");
				 for (int i = 0; i < counting.length; i++) {
					System.out.print(listOfGametes[i] + ", ");
				}
			}
			
			private void PhenoRatios() {
				int count1 = 0;
				int count2 = 0;
				int count3 = 0;
				int count4 = 0;
					String[] firstTraits = new String[9];
					String[] secondTraits = new String[9];
					
					// Green, Round = 0, 1, 3, 4
					// Green, Wrinkled = 2, 5
					// Yellow, Round = 6, 7
					// Yellow, Wrinkled = 8
					
				System.out.println("\n \n" + "For the first trait, what is the Dominant trait, and what is the Recessive trait?");
					System.out.println("Example: Type the Dominant Trait Name: Green");
				System.out.println("Type the Dominant Trait Name: ");
						String a = input.next();
					System.out.println("Example: Type the Recessive Trait Name: Yellow");
				System.out.println("Type the Recessive Trait Name: ");
						String b = input.next();
						
				System.out.println("\n" + "For the second trait, what is the Dominant trait, and what is the Recessive trait?");
					System.out.println("Example: Type the Dominant Trait Name: Round");
				System.out.println("Type the Dominant Trait Name: ");
						String c = input.next();
					System.out.println("	Example: Type the Recessive Trait Name: Wrinkled");
				System.out.println("Type the Recessive Trait Name: ");
						String d = input.next();	
				
				for (int i = 0; i < PunnetSquare.length; i++) {
					for (int j = 0; j < PunnetSquare.length; j++) {
						
		if(PunnetSquare[i][j].equals(listOfGametes[0]) || PunnetSquare[i][j].equals(listOfGametes[1]) || PunnetSquare[i][j].equals(listOfGametes[3]) || PunnetSquare[i][j].equals(listOfGametes[4])){
				
				count1++;
		}	
		if(PunnetSquare[i][j].equals(listOfGametes[2]) || PunnetSquare[i][j].equals(listOfGametes[5])){
		
			count2++;
			
	}					
		if(PunnetSquare[i][j].equals(listOfGametes[6]) || PunnetSquare[i][j].equals(listOfGametes[7])){
			
			count3++;
	}		
		if(PunnetSquare[i][j].equals(listOfGametes[8])){
			
			count4++;
	}		
		
					}
					
				}
				System.out.println(count1 + ": " + a + ", " + c);
				System.out.println(count2 + ": " + a + ", " + d);
				System.out.println(count3 + ": " + b + ", " + c);
				System.out.println(count4 + ": " + b + ", " + d);
				
				// Green, Round = 0, 1, 3, 4
				// Green, Wrinkled = 2, 5
				// Yellow, Round = 6, 7
				// Yellow, Wrinkled = 8
			}
		public static void main(String[] args) {
			DiHybridCross obj = new DiHybridCross();
			obj.Dihybrid(null);
			
			System.out.println("Would you like Phenotypic Ratios? Type 'y'");
			String b = input.next();
				if(b.equals("y")) {
					obj.PhenoRatios();
				}
			System.out.println("Would you like Genotypic Ratios? Type 'y'");
					String a = input.next();
						if(a.equals("y")) {
							obj.GenoRatios();
						}
			
			
			
			
		}

	}


