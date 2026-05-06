package Multithreading;

public class ThreadLifecycleDemo implements Runnable
{

	public void run() { //This contains the task, whenever thread starts, it executes the method
		System.out.println("Thread is running...");
		
		try {
			System.out.println("Thread is going to sleep...");
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread woke up and finishing (TERMINATED soon)");
	}
	
	public static void main(String[] args) {
		
		 ThreadLifecycleDemo obj = new ThreadLifecycleDemo();

	        // 1️.NEW State
	        Thread t1 = new Thread(obj); //Thread is created, 
	        System.out.println("State after creation: " + t1.getState());
	        
	        // 2. Runnable State
	        t1.start(); //creates a new thread and runs run() inside it
	        System.out.println("State after start(): " + t1.getState());
	        
	       // 3.Small delay to observe state changes
	        try {
	            Thread.sleep(500); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("State while running/sleeping: " + t1.getState());
	        
	       // 4. Wait for thread to finish
	        try {
	            t1.join();  //main thread waits for another thread or waiting for another thread to finish
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // 5️ Terminated State
	        System.out.println("State after completion: " + t1.getState());
	}
}


 /*
  * 
  * A thread goes through these stages:
	  1.New → Created but not started
      2.Runnable → Ready/running
      3.Running → Actually executing run()
      4.Waiting / Timed Waiting → Sleeping or waiting
      5.Terminated (Dead) → Finished execution
  * 
  * */
