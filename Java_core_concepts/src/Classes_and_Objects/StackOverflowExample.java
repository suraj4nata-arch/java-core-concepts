package Classes_and_Objects;

public class StackOverflowExample {

	public static void m1() {
        System.out.println("M1");
        m2();
    }

    public static void m2() {
        System.out.println("M2");
        m1();  // calling back
    }

    public static void main(String[] args) {
        m1();
    }
}
