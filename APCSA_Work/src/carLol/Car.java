package carLol;
public class Car {
	private static String make;
	private static String Model;
	private int numPassengers;
	private boolean isConvertible;
	private int newPassengersToAdd;
	
	Car(String mk, String mdl, boolean isConvert, int numPassage) {
		make = mk;
		Model = mdl;
		numPassengers = numPassage;
		isConvertible = isConvert;
		
	}

	public int addNumPassengers(int newPassToAdd) {
		newPassengersToAdd = newPassToAdd;
		int totalPassengers = newPassengersToAdd + numPassengers;
		return totalPassengers;
	
	}
	private static void makeModel() {
		System.out.println("The make of this car is " + make + ". The model of this car is " + Model + ".");
	}

	public static void main(String[] args) {
		Car totalPassengers = new Car("Honda", "VT600CD SHADOW VLX DELUXE", false, 4);
        System.out.println(totalPassengers.addNumPassengers(2));
	}

}
