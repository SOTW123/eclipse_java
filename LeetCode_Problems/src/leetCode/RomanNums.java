package leetCode;
import java.util.Arrays;
import java.util.Scanner;

public class RomanNums {
	public int romanToInt(String s) {
		String[] symbol = {"I", "V", "X", "L", "C", "D", "M"};
        String[] exceptions = {"IV", "IX", "CM", "XC", "CD", "XL"};
        int total = 0;
        int[] counter = new int[symbol.length+1];
        
        // exceptions
	       		if(s.contains(exceptions[0])) {
	        		total += 4;
	        		s = s.replaceAll(exceptions[0], "");
	        	}
	        	if(s.contains(exceptions[1])) {
	        		total += 9;
	        		s = s.replaceAll(exceptions[1], "");
	        	}
	        	if(s.contains(exceptions[2])) {
	        		total += 900;
	        		s = s.replaceAll(exceptions[2], "");
	        	}
	        	if(s.contains(exceptions[3])) {
	        		total += 90;
	        		s = s.replaceAll(exceptions[3], "");
	        	}
	        	if(s.contains(exceptions[4])) {
	        		total += 400;
	        		s = s.replaceAll(exceptions[4], "");
	        	}
	        	if(s.contains(exceptions[5])) {
	        		total += 40;
	        		s = s.replaceAll(exceptions[5], "");
	        	}
	        	System.out.println(s);
			
        
        // regular counting
	        	/*
        for (int i = 0; i < s.length(); i++) {
        			
        		if(s.contains(symbol[0])) counter[0]++;
        		System.out.println(Arrays.toString(counter));
        		if(s.contains(symbol[1])) counter[1]+=5;
        		System.out.println(Arrays.toString(counter));
        		if(s.contains(symbol[2])) counter[2]+=10;
        		System.out.println(Arrays.toString(counter));
        		if(s.contains(symbol[3])) counter[3]+=50;
        		System.out.println(Arrays.toString(counter));
        		if(s.contains(symbol[4])) counter[4]+=100;
        		System.out.println(Arrays.toString(counter));
        		if(s.contains(symbol[5])) counter[5]+=500;
        		System.out.println(Arrays.toString(counter));
        		if(s.contains(symbol[6])) counter[6]+=1000;
        		System.out.println(Arrays.toString(counter));
		}
        */
	        	for (int i = 0; i < s.length(); i++) {
	        		if(s.substring(i, i+1).equals(symbol[0])) counter[0]++;
	        		// System.out.println(Arrays.toString(counter));
	        		if(s.substring(i, i+1).equals(symbol[1])) counter[1]+=5;
	        		// System.out.println(Arrays.toString(counter));
	        		if(s.substring(i, i+1).equals(symbol[2])) counter[2]+=10;
	        		// System.out.println(Arrays.toString(counter));
	        		if(s.substring(i, i+1).equals(symbol[3])) counter[3]+=50;
	        		// System.out.println(Arrays.toString(counter));
	        		if(s.substring(i, i+1).equals(symbol[4])) counter[4]+=100;
	        		// System.out.println(Arrays.toString(counter));
	        		if(s.substring(i, i+1).equals(symbol[5])) counter[5]+=500;
	        		// System.out.println(Arrays.toString(counter));
	        		if(s.substring(i, i+1).equals(symbol[6])) counter[6]+=1000;
	        		// System.out.println(Arrays.toString(counter));
				}
        
        
        // adding up
        for (int i = 0; i < counter.length; i++) {
			total += counter[i];
		}
        
        // printing
        	
        	System.out.println(total);
        	return total;
        } 
        
        
         
    
	
	public static void main(String[] args) {
		RomanNums obj = new RomanNums();
		obj.romanToInt("MMMMM");
		
	}
}
