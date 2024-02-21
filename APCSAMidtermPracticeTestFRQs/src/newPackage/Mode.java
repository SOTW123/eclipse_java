package newPackage;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Mode {
 // sorting method
 // mode method
	static ArrayList<Integer> list = new ArrayList<>();
	static Random rand = new Random();
	
	private void setArrayList() {
		list.add(6);
		list.add(1);
		list.add(6);
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(6);
	}
	
	private void Sorting(ArrayList<Integer> array) {
		
	}
	
	public static void main(String[] args) {
		// ArrayList initialization
		Mode obj = new Mode();
		obj.setArrayList();
		obj.Sorting(list);

	}

}
