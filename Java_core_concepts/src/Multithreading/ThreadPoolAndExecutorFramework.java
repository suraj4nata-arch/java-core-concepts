package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolAndExecutorFramework 
{
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);  //Only 2 threads are created
		for(int i=1; i<=5;i++) {
			int taskId = i;
			executor.submit(() -> {   //5 tasks submitted, only two thread is created
                System.out.println("Task " + taskId + " is handled by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(2000); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
            });
       
		}
		// Shutdown the executor
        executor.shutdown(); //no new tasks, execute tasks finishing
	}
}

/*
 * ExecutorService → manages threads
submit() → gives task to pool
newFixedThreadPool(n) → fixed number of threads
shutdown() → stop accepting new tasks
 * 
 * */
