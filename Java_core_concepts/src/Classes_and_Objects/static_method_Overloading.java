package Classes_and_Objects;

public class static_method_Overloading 
{
	public static void m1() {
		System.out.println("static method overloading");
	}
	
	public static void m1(int x) {
		System.out.println(x);
	}
	
	public static void m1(int x, double y) {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void m1(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		static_method_Overloading.m1();
		static_method_Overloading.m1(10);
		static_method_Overloading.m1(10, 20.0);
		static_method_Overloading.m1("Nothing");
	}
}
