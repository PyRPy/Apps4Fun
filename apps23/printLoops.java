package apps23;
import java.util.*;

public class printLoops {

	public static void main(String[] args) {
		// while loop
		int i = 1;
		while ( i <= 10 ) {
			System.out.println( i );
			i++;
		}
		System.out.println( "----------" );
		// for loop y++
		for (int y = 0; y < 10; y++ ) {
			System.out.println( y );
		}
		
		System.out.println( "----------" );
		
		// for loop with i--
		for (int j = 10; j > 0; j-- ) {
			System.out.println( j );
			
		}
		
		// print triangle numbers
		System.out.println( "----- triangular number -----" );
		int x = 1;
		int triangularNumber = 1;
		while ( x <= 10 ) {
			
			System.out.println(triangularNumber);
			x++;
			triangularNumber = triangularNumber + x;
		}
		
		// print out arrays
		System.out.println( "----- for each loop -----" );
		String[] familyMembers = {"me", "you", "he"};
		for (String name : familyMembers) {
			
			System.out.println(name);
			
		}
		
		// use array list
		System.out.println( "----- use ArrayList -----" );
		List<String> familyList = new ArrayList<String>();
		familyList.add("me");
		familyList.add("he");
		familyList.add("she");
		
		for (String name : familyList ) {
			System.out.println(name);
		}
		
		

	}

}
