package newPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateNumbersInArrayLists {
	public static boolean duplicates(ArrayList<Integer> list) {
	    for (int i = 0; i < list.size(); i++) {
	        int currentElement = list.get(i);
	        for (int j = i + 1; j < list.size(); j++) {
	            int nextElement = list.get(j);
	            if (currentElement == nextElement) {
	            	System.out.println("true");
	                return true; // found a duplicate element
	            }
	        }
	    }
	    System.out.println("false");
	    return false; // no duplicates found
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(9);
		duplicates(list);
	}

}
