package Abstraction;

public class MainVehicle
{
	public static void main(String[] args) {
		car c=new car();
		c.startEngine();
		
		bike b=new bike();
		b.startEngine();
		
		//Vehicle v=new Vehicle(); vehicle cannot be instantiated because it has no implementation or incomplete implementation
		//v.fuelType();
	}
}
