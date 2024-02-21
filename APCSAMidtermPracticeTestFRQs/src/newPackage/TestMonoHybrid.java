package newPackage;

import java.util.Arrays;
import java.util.Scanner;

public class TestMonoHybrid {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String a = "Among aA";
		String rev = a.substring(6, 8);
		StringBuffer str = new StringBuffer(rev);
		StringBuffer str2 = new StringBuffer(a);
		str.reverse();
		
		a = a + " " +  str;
		
		System.out.println(a);
		a.replace("aA", "Aa");
		System.out.println(a);
		
	}
}
