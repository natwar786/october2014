package Lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {
		    public void run() {
		    	 String threadName = Thread.currentThread().getName();
				    System.out.println("Hello " + threadName);
				    
				    try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        System.out.println("Asynchronous task");
		    }
		});
		executorService.execute(new Runnable() {
		    public void run() {
		    	 String threadName = Thread.currentThread().getName();
				    System.out.println("Hello " + threadName);
		        System.out.println("Asynchronous task");
		    }
		});
		
		executorService.shutdownNow();
	}

}
