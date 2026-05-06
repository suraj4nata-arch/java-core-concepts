package Classes_and_Objects;

public class PassingSomethingReturningNothing 
{
	public static void m1(int a, int b) 
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void m2(char a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("m1 starts");
		m1(5,6);
		System.out.println("m1 ends");
		
		System.out.println("m2 starts");
		m2('A', "Suraj");
		System.out.println("m2 ends");
	}
}
