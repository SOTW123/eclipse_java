package newPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class testMyClass {
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread();
		thread.start();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5));
		System.out.println(list.toString());
		
		int maximumValue = 0;
		
		
		
	if(list.get(0) > list.get(1)) {
		if(list.get(0) > list.get(2)) {
			System.out.println("The maximum value: " + list.get(0));
		}
		else if(list.get(0) < list.get(2)) {
			System.out.println("The maximum value: " + list.get(2));
		}
	}
	else if(list.get(0) < list.get(1)) {
			if(list.get(1) > list.get(2)); {
				System.out.println("The maximum value: " + list.get(1));
				Thread.sleep(500);
			}
			if(list.get(1) < list.get(2)) {
				System.out.println("The maximum value: " + list.get(2));
			}
			
	}
			/*
			if(list.get(2) > list.get(1)); {
				System.out.println("The maximum value: " + list.get(2));
				Thread.sleep(500);
			}
		}
		

/* if(list.get(0) > list.get(1)); {
		if(list.get(0) > list.get(2)); {
			System.out.println("The maximum value: " + list.get(0));
		}
		if(list.get(2) > list.get(0)); {
			System.out.println("The maximum value: " + list.get(2));
		}
	}
	if(list.get(1) > list.get(0)) {
		if(list.get(1) > list.get(2)); {
			System.out.println("The maximum value: " + list.get(1));
		}
		if(list.get(2) > list.get(1)); {
			System.out.println("The maximum value: " + list.get(2));
		}
	}
	*/
		
		

	}

}
