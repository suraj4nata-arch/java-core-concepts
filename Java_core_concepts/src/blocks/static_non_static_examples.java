package blocks;

public class static_non_static_examples 
{
	static 
	{
		System.out.println("Static-1 block is executed");
	}
	
	{
		System.out.println("non static is executed");
	}
	
	static
	{
		System.out.println("Static-2 block is executed");
	}
	
	{
		System.out.println("non static-2 is executed");
	}
	
	public static void main(String[] args) {
		 new static_non_static_examples();
	}
	
}
