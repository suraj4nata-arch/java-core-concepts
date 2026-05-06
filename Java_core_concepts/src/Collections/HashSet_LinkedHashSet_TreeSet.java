package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_LinkedHashSet_TreeSet 
{
	public static void main(String[] args) {
		
		//HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("C");
		System.out.println(hashSet);
		
		//LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		System.out.println(linkedHashSet);
		
		//TreeSet
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		System.out.println(treeSet);
	}
}
