package apps23;
//The Complete Android Oreo Developer Course - Build 23 Apps!
//basic java programming
import java.util.HashMap;

public class PrintMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Dog", "lilia");
		map.put("Cat", "lilili");
		
		System.out.println(map.get("Dog"));
		System.out.println(map.toString());
		System.out.println(map.size());

	}

}

