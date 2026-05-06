package Multithreading;

public class MyThread extends Thread
{
	public void run() {  //this method contains the task
		System.out.println("A thread is running...");
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.run(); //no multithreading
		t1.start();  //starts a new thread 
	}
}
