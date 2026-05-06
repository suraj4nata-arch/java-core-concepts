package Collections;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<ComparableStudent>
{
	int marks;
	String name;

	public ComparatorStudent(int marks, String name) {
		this.marks=marks;
		this.name=name;
	}
	
    public String toString() {
        return marks + " " + name;
    }
    
	@Override
	public int compare(ComparableStudent o1, ComparableStudent o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
