package Collections;

import java.util.ArrayList;

public class BasicCollectionExample
{
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList();
		names.add("James");
		names.add("John");
		names.add("Jack");
		
		System.out.println(names); //print the collection
		
		System.out.println("First name: "+names.get(0)); //get the name in the 0th index
		System.out.println("Third name: "+names.get(2));//get the name in the 2nd index
		names.remove("Jack");  //remove the Jack name
		System.out.println(names); //print the names after removal
		for(String name: names) {  //loop through collection
			System.out.println(name);
		}
	}
	
}
