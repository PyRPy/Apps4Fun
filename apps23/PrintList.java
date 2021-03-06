package apps23;
import java.util.*;
//The Complete Android Oreo Developer Course - Build 23 Apps!
//basic java programming
public class PrintList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(2);
		list.add(2);
		list.add(5);
		// print original array
		System.out.println(list.toString());
		
		// remove item at index 1
		list.remove(1);
		
		// print out list again
		System.out.println(list.get(1));
		
		

	}

}
