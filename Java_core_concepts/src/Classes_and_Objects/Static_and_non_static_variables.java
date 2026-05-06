package Classes_and_Objects;

public class Static_and_non_static_variables 
{
	String s2="static variable";             //static variables
	static String s1="Non static variable";  //Non static variables
	
	public static void main(String[] args) {
		System.out.println(Static_and_non_static_variables.s1); //Accessing static variables
		
		Static_and_non_static_variables n = new Static_and_non_static_variables();
		System.out.println(n.s2); //Accessing non static variables
	} 
}
