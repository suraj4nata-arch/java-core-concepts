package constructors;

public class student_example {
	int id;
	String name;
	double marks;
	
	public student_example(int a, String b, double c) {
		id=a;
		name=b;
		marks=c;
	}
	
	public static void main(String[] args) {
		student_example s1 = new student_example(1, "John Wick", 99.99);
		student_example s2 = new student_example(2, "Jack", 92.99);
		student_example s3 = new student_example(3, "Martic", 94.99);
		
		System.out.println(s1.id + " " +s1.name + " " + s1.marks);
		System.out.println(s2.id + " " +s2.name + " " + s2.marks);
		System.out.println(s3.id + " " +s3.name + " " + s3.marks);
	}
	
}
