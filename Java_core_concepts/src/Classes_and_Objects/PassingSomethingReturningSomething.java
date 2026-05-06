package Classes_and_Objects;

public class PassingSomethingReturningSomething 
{
	public static int m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		return 10;
	}
	
	public static double m2(char a, char b) {
		System.out.println(a);
		System.out.println(b);
		return 4.4;
	}
	
	public static void main(String[] args) {
		int a=m1(30, 20);
		System.out.println(a);
		
		double d =m2('F', 'G');
		System.out.println(a);
	}
}
