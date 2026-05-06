package constructors;

public class constructor_overloading_example 
{
	int id;
	String name;
	long phone;
	String email;
	
	public constructor_overloading_example(int a, String b, long c, String d) {
		id=a;
		name=b;
		phone=c;
		email=d;
	}
	
	public constructor_overloading_example(int a, String b) {
		id=a;
		name=b;
	}
	
	public constructor_overloading_example(long a, String b) {
		phone=a;
		email=b;
	}
	public constructor_overloading_example(String a, long b) {
		name=a;
		phone=b;
	}
	
	public static void main(String[] args) {
		constructor_overloading_example c1 = new constructor_overloading_example(10, "nothing");
		System.out.println(c1.id+ " "+ c1.name);
		
		constructor_overloading_example c2 = new constructor_overloading_example("nothing", 000);
		System.out.println(c1.name+ " "+ c1.phone);
	}
	
}
 
