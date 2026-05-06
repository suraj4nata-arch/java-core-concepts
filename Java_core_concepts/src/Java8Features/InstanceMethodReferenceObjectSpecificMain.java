package Java8Features;

public class InstanceMethodReferenceObjectSpecificMain 
{
	public static void main(String[] args) {
		InstanceReferenceDemo d = new InstanceReferenceDemo();
		
        // Lambda
		InstanceReferenceDemoInterface obj1 = () -> d.show();
        obj1.display();

        // Method Reference
        InstanceReferenceDemoInterface obj2 = d::show;  //instanceReferenceVariableName::methodName
        obj2.display();
	}
}
