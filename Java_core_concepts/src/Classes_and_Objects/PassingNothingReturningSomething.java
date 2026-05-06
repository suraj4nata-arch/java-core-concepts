package Classes_and_Objects;

public class PassingNothingReturningSomething 
{
	public static int m1() {
		return 100;
	}
	
	public static double m2() {
		return 10.3;
	}
	
	public static char m3() {
		return 'a';
	}
	
	public static void main(String[] args) {
		int a=m1();
		System.out.println(a);
		
		double b=m2();
		System.out.println(b);
		
		char c=m3();
		System.out.println(c);
	}
}
