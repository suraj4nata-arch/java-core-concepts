package constructors;

public class constructor_calling 
{
	public constructor_calling() {
		System.out.println("No argument constructor");
	}
	
	public constructor_calling(int x) {
		this();
		System.out.println(x);
	}
	
	public constructor_calling(String s, boolean b) {
		this(10);
		System.out.println(s);
		System.out.println(b);
	}
	
	public constructor_calling(char c, double d) {
		this("Hello", true);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		new constructor_calling('A', 23.23);
	}
}
