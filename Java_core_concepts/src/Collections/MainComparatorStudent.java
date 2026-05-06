package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparatorStudent 
{
	public static void main(String[] args) {
		List<ComparatorStudent> arrayList = new ArrayList<>();
		arrayList.add(new ComparatorStudent(85, "A"));
		arrayList.add(new ComparatorStudent(60, "B"));
		arrayList.add(new ComparatorStudent(90, "C"));
		
		System.out.println(arrayList);
		
		//comparator for marks
		Comparator<ComparatorStudent> byMarks = (s1, s2) -> s1.marks - s2.marks; //compare two students based on marks
		                                                   //s1 -> first student and s2 second student
		Collections.sort(arrayList,byMarks);
		System.out.println("Sorted by marks: " + arrayList);
		
		//Comparator for name 
		Comparator<ComparatorStudent> byName = (s1, s2) -> s1.name.compareTo(s2.name); //compare two students based on marks
		Collections.sort(arrayList,byName);
		System.out.println("Sorted by marks: " + arrayList);
	}
}
