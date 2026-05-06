package Polymorphism;

public class main_static_polymorphism 
{
	public static void main(String[] args) {
		static_polymorphism s= new static_polymorphism();
		System.out.println(s.add(10.2, 22.3));
		System.out.println(s.add(32, 21));
		System.out.println(s.add(32, 66, 62));
	}
}
