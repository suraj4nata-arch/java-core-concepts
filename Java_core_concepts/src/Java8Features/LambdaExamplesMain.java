package Java8Features;

public class LambdaExamplesMain implements LambdaExamples{

	public static void main(String[] args) {
	LambdaExamples l = (a, b) -> a + b; //(parameters) -> expression
	System.out.println(l.add(5, 3));
}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}

 //Runnable r = () -> System.out.println("Hello"); -->  (parameters) -> expression