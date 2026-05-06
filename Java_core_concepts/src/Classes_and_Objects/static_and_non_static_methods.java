package Classes_and_Objects;

public class static_and_non_static_methods
{
	public static void m1() {
		System.out.println("Accessing static method");
	}
	public void m2() {
		System.out.println("Accessing non static method");
	}
	
	public static void main(String[] args) {
		static_and_non_static_methods.m1();
		
		static_and_non_static_methods s = new static_and_non_static_methods();
		s.m2();
	}
}
