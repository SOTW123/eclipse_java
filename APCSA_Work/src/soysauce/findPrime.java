package soysauce;

public class findPrime {
	
 int newCount = 0;
 boolean YesPrime = true;
 boolean NoPrime = false;
	
	public boolean IsPrime(int y) {
		
		for(int i = 1; i <= y; i++) {
			if(y % i == 0) {
				newCount++;
			}
		}
		if(newCount > 2) {
			System.out.println(NoPrime);
		}
		else if(newCount == 2) {
			System.out.println(YesPrime);
		}
		
		System.out.println(newCount);
		
		return true;
	}
	
	
	
	
	
	public static void main(String[] args) {
		findPrime object = new findPrime();
		object.IsPrime(6);
		
			
			
	
	}
	
}
