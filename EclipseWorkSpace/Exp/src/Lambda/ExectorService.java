package Lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExectorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});
		executor.shutdown();
        executor.shutdownNow();
	}

}
