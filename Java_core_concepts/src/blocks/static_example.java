package blocks;

public class static_example 
{
	static
	{
		System.out.println("Static block-1 executed");
	}
	static 
	{
		System.out.println("Static block-2 executed");
	}
	static
	{
		System.out.println("Static block-3 executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Main");
	}
}
