package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_LinkedHashMap_treeMap 
{
	public static void main(String[] args) {
		
		//hashMap
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(4, "A");
		hashMap.put(3, "B");
		hashMap.put(2, "C");
        hashMap.put(1, "D");
        System.out.println(hashMap);
        
        //linkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //always prints in order of insertion
        linkedHashMap.put(4, "A");
        linkedHashMap.put(3, "B");
        linkedHashMap.put(2, "C");
        linkedHashMap.put(1, "D");
        System.out.println(linkedHashMap);
        
        Map<Integer, String> treeMap = new TreeMap<>(); //sorts key automatically
        treeMap.put(4, "A");
        treeMap.put(3, "B");
        treeMap.put(2, "C");
        treeMap.put(1, "D");
        System.out.println(treeMap);     
	}
}
