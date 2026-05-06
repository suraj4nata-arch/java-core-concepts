package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList_ComparisonExample 
{
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		System.out.println(arrayList);
		arrayList.add(1, "X");
		System.out.println(arrayList);
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		System.out.println(linkedList);
		linkedList.add(1, "G");
		System.out.println(linkedList);
	}
}
