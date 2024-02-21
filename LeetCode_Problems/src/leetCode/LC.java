package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LC {
	public int romanToInt(String s) {
        String[] symbol = {"I", "V", "X", "L", "C", "D", "M"};
        int total = 0;
        
        // regular counting
        for (int i = 0; i < s.length(); i++) {
        		if(s.substring(i, i+1).equals("I")) {
        			total++;
    			}
        		else if(s.substring(i, i+1).equals("V")) {
        			total+=5;
    			}
        		else if(s.substring(i, i+1).equals("X")) {
        			total+=10;
    			}
        		else if(s.substring(i, i+1).equals("L")) {
        			total+=50;
    			}
        		else if(s.substring(i, i+1).equals("C")) {
        			total+=100;
    			}
        		else if(s.substring(i, i+1).equals("D")) {
        			total+=500;
    			}
        		else if(s.substring(i, i+1).equals("M")) {
        			total+=1000;
    			}
		}
        	// conditions
        
        
        	System.out.println(total);
        	return total;
        } 
        
        
         
    
	
	public static void main(String[] args) {
		LC obj = new LC();
		Scanner input = new Scanner(System.in);
		String a = input.next();
		obj.romanToInt(a);
		
	}

}
