package Classes_and_Objects;

public class NonStaticVariableExample 
{
	String name;  //non static variable
	int marks; //non static variable
	
	public static void main(String[] args) {
		
		NonStaticVariableExample n = new NonStaticVariableExample(); //we need to create an object to access non static variable
		n.name="suraj";
		n.marks=1000;
		System.out.println(n.name);
		System.out.println(n.marks);
		
	}
}


