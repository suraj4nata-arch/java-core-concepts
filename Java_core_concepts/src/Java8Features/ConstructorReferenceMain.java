package Java8Features;

public class ConstructorReferenceMain {
	
	public static void main(String[] args) {

        // Lambda
        Factory f1 = () -> new Student();
        f1.create();

        // Constructor Reference
        Factory f2 = Student::new;  //className::new  (new is the keyword)
        f2.create();
    }
}
