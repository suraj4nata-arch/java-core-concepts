package Collections;

public class ComparableStudent implements Comparable<ComparableStudent>
{
	int marks;
	String name;
	
	public ComparableStudent(int marks, String name) {
		this.marks=marks;
		this.name=name;
	}
	
	 public int compareTo(ComparableStudent other) {
	        return this.marks - other.marks; // ascending order
	    }
	 
	@Override
	public String toString() {
		return "ComparableStudent [marks=" + marks + ", name=" + name + "]";
	}
	
	
}
