package this_super_keywords;

public class this_keyword 
{
	int x=100;
	int y=200;
	
	public this_keyword() 
	{
		int x=10;
		int y=20;
		System.out.println(x); //prints the local variable value of x
		System.out.println(y); //prints the local variable value of y
		System.out.println(this.x); //prints the non static variable of x
		System.out.println(this.y); //prints the non static variable of y
	}
	
	public static void main(String[] args) {
		new this_keyword();
	}
}

