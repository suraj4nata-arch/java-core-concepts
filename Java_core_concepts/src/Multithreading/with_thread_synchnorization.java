package Multithreading;

public class with_thread_synchnorization 
{
	int counter =0;
	public synchronized void counter() {
		counter ++; //now its is safe to count
	}
	
	public static void main(String[] args) throws InterruptedException {
		with_thread_synchnorization c = new with_thread_synchnorization();
		
		  Thread t1 = new Thread(() -> {   //creating a new thread t1, that counts from 0 to 1000
	            for(int i = 0; i < 1000; i++) {
	                c.counter();
	            }
	        });
	
		  Thread t2 = new Thread(() -> {  //creating a another new thread t2, that counts from 0 to 1000
	            for(int i = 0; i < 1000; i++) {
	                c.counter();
	            }
	        });
		  
		  t1.start();
		  t2.start();
		  
		  t1.join();
		  t2.join();
		  
		  System.out.println("Final Count: " + c.counter);
	}
}

/*
 * synchronized = Only one thread allowed at a time
 * Step 1: Thread tries to enter	
			t1 comes → takes the key
            t2 comes → WAITS outside
	
   Step 2: t1 finishes → gives back key
           t2 enters	

 * */


