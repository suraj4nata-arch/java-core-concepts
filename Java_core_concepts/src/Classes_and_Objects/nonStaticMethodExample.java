package Classes_and_Objects;

public class nonStaticMethodExample 
{
	public void m1() {  //non static method
		System.out.println("Accessing non static method");
	}
	public static void main(String[] args) {
		nonStaticMethodExample n = new nonStaticMethodExample();  //accessing non static method using reference variable
		n.m1();
	}
}
