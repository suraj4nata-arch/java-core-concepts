package Collections;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class SortingExample 
{
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		System.out.println("before sorting: " + arrayList);
		
		//1. Sorts the list
		Collections.sort(arrayList);    //sorts the array in increasing order
		System.out.println("after sorting: " + arrayList);
		
		//2. reverses the list
		Collections.reverse(arrayList); //sorts the array in reverse order
		System.out.println("after reverse: " + arrayList);
		
		//3. shuffles the list in a random order
		Collections.shuffle(arrayList);  //shuffles to random order, changes everytime!
		System.out.println("after shuffling: " + arrayList);
		
		//4. searches the element
		Collections.sort(arrayList);  //list must be sorted first 
		int index = Collections.binarySearch(arrayList, 2);
		System.out.println("Index of 2: " + index); //index of element 2 is 1
		
		//5. Min and Max
		int min = Collections.min(arrayList); //stores the min element in a variable
		int max = Collections.max(arrayList); //stores the max element in a variable
		System.out.println("Min: " + min); 
		System.out.println("Max: " + max);
		
	} 
}
