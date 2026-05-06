package inheritance;

public class child_class extends parent_class
{
	int b=10;
	
	public static void main(String[] args) {
		child_class c=new child_class();
		System.out.println(c.a); //accessing the variable from parent class
		c.m1();  //accessing the method from parent class
	}
}