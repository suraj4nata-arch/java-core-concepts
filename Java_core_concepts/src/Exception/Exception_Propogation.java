package Exception;

public class Exception_Propogation 
{
	static void method1() {
		int result=10/0;
	}
	
	static void method2() {
		method1();
	}
	
	static void method3() {
		try {
			method2();
		}
		
		catch (ArithmeticException e) {
			System.out.println("Exception handled in method 3");
		}
	}
	
	public static void main(String[] args) {
		method3();
	}
}
