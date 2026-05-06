package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionConnection 
{
	public static void main(String[] args) {
		
		//List (Allows duplicates, maintains order)
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");		
		System.out.println("List: "+list);
		
		//SET no duplicates, no order guaranteed
		Set<String> set = new HashSet<>();
			set.add("Apple");
			set.add("Banana");
			set.add("Carrot");
			set.add("Carrot"); //ignores duplicates
			System.out.println("set: "+set);
		
		//MAP stores data as key value pairs
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Carrot");
		map.put(3, "Carrot"); //ignores duplicates
		System.out.println("map: "+map);
		
	}
}
