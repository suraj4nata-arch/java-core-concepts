package Collections;

import java.util.Map;
import java.util.*;

public class HashMapExample 
{
	public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "A");
		hashMap.put(3, "B");
		hashMap.put(2, "C");
		hashMap.put(1, "D");
		
		System.out.println(hashMap);
		
		// Access
        System.out.println("Key 2 → " + hashMap.get(2));
	}
}
