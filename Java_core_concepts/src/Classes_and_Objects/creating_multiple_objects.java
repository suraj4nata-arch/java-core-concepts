package Classes_and_Objects;

public class creating_multiple_objects 
{
	int a=10;
	public void m1() {
		System.out.println("Accessing non static method");
	}
	public static void main(String[] args) {
		creating_multiple_objects c = new creating_multiple_objects();
		c.m1();
		System.out.println(c.a);
		
		creating_multiple_objects c1 = new creating_multiple_objects();
		c1.m1();
		System.out.println(c1.a);
	}
}
