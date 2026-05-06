package blocks;

public class non_static_example 
{
	{
		System.out.println("Non static block-1 is executed!!");
	}
	{
		System.out.println("Non static block-2 is executed!!");
	}
	public static void main(String[] args) {

		
		new non_static_example();
		System.out.println("Main Method ends the execution");
		
	}
}
