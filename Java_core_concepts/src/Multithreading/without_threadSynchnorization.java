package Multithreading;

public class without_threadSynchnorization 
{
	int counter =0;
	public void counter() {
		counter ++;  //unsafe
	}
	
	public static void main(String[] args) throws InterruptedException {
		without_threadSynchnorization c = new without_threadSynchnorization();
		
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
 * without synchnorization, this gives random count each and everytime
 * Without synchronized → threads interfere with each other
 *                        both thread reads the same old value, they overlap, they lost
 * */
