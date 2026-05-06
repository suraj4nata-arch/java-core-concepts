package Classes_and_Objects;

public class non_static_without_reference_Variable 
{
	int a=10;
	int b=20;
	public static void main(String[] args) {
		System.out.println(new non_static_without_reference_Variable().a); //accessing without non static variable
		System.out.println(new non_static_without_reference_Variable().b);
	}
}
