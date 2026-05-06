package Java8Features;

public class StaticMethodReferenceMain 
{
	public static void main(String[] args) {
		
        // Lambda
        MyInterface obj1 = () -> Demo.sayHello();
        obj1.display();
        
        // Method Reference
        MyInterface obj2 = Demo::sayHello;   //className::methodName
        obj2.display();
    }
	}
