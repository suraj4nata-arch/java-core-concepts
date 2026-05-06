package constructors;

public class constructor_static_non_static 
{
	public constructor_static_non_static() {
		System.out.println("3rd-Third Constructor is exeuted");
	}
	
	{
		System.out.println("2nd-Non static block is executed");
	}
	
	static
	{
		System.out.println("1st-Static block is executed!!");
	}
	
	public static void main(String[] args) {
		System.out.println(" Then Main method starts");
		new constructor_static_non_static();
		System.out.println("At last Main method ends");
	}
}
