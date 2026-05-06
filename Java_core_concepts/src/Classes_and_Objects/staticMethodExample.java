package Classes_and_Objects;

public class staticMethodExample 
{
	public static void m1() {    // static method
		System.out.println("Accessing static method");
			
	}
	public static void main(String[] args) {
		staticMethodExample.m1(); //Accessing static method using class name
	}
}
