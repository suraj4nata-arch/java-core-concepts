package Classes_and_Objects;

public class MethodExample
{
	public static void sayHello() {
		System.out.println("Hello World");
	}
	
	public static void sayHi() {
		System.out.println("Hi World");
	}
	
	public static void m1() {
		System.out.println("m1 Method starts");
		sayHello();
		sayHi();
		System.out.println("m1 Method ends");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method starts");
		sayHello();
		m1();
		sayHi();
		System.out.println("Main Method ends");
	}
}
