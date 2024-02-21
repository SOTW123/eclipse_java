package newPackage;
import java.lang.reflect.Array;

public class revArray {
	StringBuilder str = new StringBuilder();
	
	int[] reverseArray(int[] array) {
		
		
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
			
		}
		
		return array;
		
	}

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		
		revArray obj = new revArray();
		obj.reverseArray(myArray);
	}
}
