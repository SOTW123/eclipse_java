package newPackage;
import java.util.ArrayList;
import java.util.Iterator;
public class MyClass {
public static void main(String args[]) {
	ArrayList<Integer> list = new ArrayList<>();
	//appending an element to the list in the next available index
	list.add(3);
	list.add(8);
	list.add(1);
	list.add(6);
	list.add(2);
	list.add(5);
	list.add(9);
	list.add(4);
	
		//Q1 traverse arraylist using loop
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		//Q2 arraylist size
			System.out.println("Size: " + list.size());
		//Q3 adding an element to the list in a specific index of 0
			list.add(0, 10);
		//Q4 traverse arraylist using enhanced loop
			for (Integer a : list) {
				System.out.println(a);
			}
			
		//Q5 accessing an element in the list based on its location index of number 2
			System.out.println(list.get(2));
	
		//Q6 replace an element at index 5 location of on the list while storing the previous value
			int preVal = list.get(5);
			list.set(5, 11);
			
		//Q7 delete an element at index 3 location on the list and storing its value
			int val = list.get(3); 
			list.remove(3);
			
		//Q8 let us find the minimum number in the arraylist and its location (3 points)
			System.out.println(list.toString());
			int minVal = list.get(0);
			int minLocation = 0;
				for (int i = 0; i < list.size(); i++) {
					if(minVal > list.get(i)) {
						minVal = list.get(i);
						minLocation = i;
					}
					
				}
			System.out.println("The Min Val: " + minVal);
			System.out.println("The Min Val Location: " + minLocation);
			
		//Q9 let us find the maximum number in the array list and its location (4 points)
			int maxVal = list.get(0);
			int maxValLocation = 0;
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i) > maxVal) {
					maxVal = list.get(i);
				}
			}
			System.out.println("The Max Val: " + maxVal);
			
		//Q10 let us get the sum and average of the elements in the list (6 points)
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}
			int avg = sum / list.size();
			System.out.println("The sum is: " + sum + ". The average is: " + avg + ". ");
			
		}
}																			