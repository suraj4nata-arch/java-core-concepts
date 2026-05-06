package this_super_keywords;

public class super_keyword_child_class extends super_keyword_parent_class
{
	int x=15;
	int y=20;
	
	public super_keyword_child_class() {
		int x=25;
		int y=30;
		System.out.println("Accessing local variable of child class= "+x);
		System.out.println("Accessing local variable of child class= "+y);
		System.out.println("Accessing non static variable of child class using 'this' keyword= "+this.x);
		System.out.println("Accessing non static variable of child class using 'this' keyword= "+this.y);
		System.out.println("Accessing non static variable of Super class using 'Super' keyword= "+super.x);
		System.out.println("Accessing non static variable of child class using 'Super' keyword= "+super.y);
	}
	
	public static void main(String[] args) {
		new super_keyword_child_class();
	}
	
}
