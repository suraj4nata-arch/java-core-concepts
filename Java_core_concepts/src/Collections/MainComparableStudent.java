package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class MainComparableStudent 
{
	public static void main(String[] args) {
		List<ComparableStudent> studentsList = new ArrayList<>();
		studentsList.add(new ComparableStudent(20, "John")); //adding the student details by creating an object
		studentsList.add(new ComparableStudent(30, "Jack"));
		studentsList.add(new ComparableStudent(10, "Amy"));
		
		Collections.sort(studentsList);  //Sorted by marks (ascending)
		System.out.println(studentsList);
	}
}
