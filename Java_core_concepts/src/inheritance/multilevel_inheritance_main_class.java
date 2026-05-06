package inheritance;

public class multilevel_inheritance_main_class 
{
	public static void main(String[] args) {
		multilevel_inheritance_class_C c=new multilevel_inheritance_class_C();
		System.out.println(c.a);  //accessing multilevel_inheritance_class_A properties/variables class c reference variable
		c.m1();  //Accessing multilevel_inheritance_class_A method using class c reference variable
		
		System.out.println(c.b); //accessing multilevel_inheritance_class_B properties/variables class c reference variable
		c.m2();
		
		System.out.println(c.c); //accessing multilevel_inheritance_class_C properties/variables class c reference variable
		c.m3();
	}
}
