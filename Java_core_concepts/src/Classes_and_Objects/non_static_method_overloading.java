package Classes_and_Objects;

public class non_static_method_overloading 
{
	public void m1() {
		System.out.println("non static method");
	}
	
	public void m1(int x) {
		System.out.println(x);
	}
	
	public void m1(double d) {
	    System.out.println(d);
	}
	
	public void m1(String s) {
	    System.out.println(s);
	}

	public static void main(String[] args) {
		non_static_method_overloading n1 = new non_static_method_overloading();
		n1.m1();
		n1.m1(10);
		n1.m1(10.20);
		n1.m1("Nothing");
		
	}
}