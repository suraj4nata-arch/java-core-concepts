package Multithreading;

public class MyRunnable implements Runnable
{

	@Override
	public void run() { //This contains the task, whenever thread starts, it executes the method
		System.out.println("A thread is running...");
	}
	
	public static void main(String[] args) {
		MyRunnable m1=new MyRunnable();
		Thread t1=new Thread(m1); //passing MyRunnable object to this thread method	
		t1.start();  //creates a new thread and runs run() inside it
	}
	
}
