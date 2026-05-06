package constructors;

public class constructor_overloading 
{
	public constructor_overloading(){
		System.out.println("No argument constuctor");
	}
	
	public constructor_overloading(int a){
		System.out.println(a);
	}
	public constructor_overloading(double d){
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		new constructor_overloading();
		new constructor_overloading(10);
		new constructor_overloading(10.2);
	}
	
}
