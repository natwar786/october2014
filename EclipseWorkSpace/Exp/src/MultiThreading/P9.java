package MultiThreading;

public class P9 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread( new P9()); 
		t.start();
		System.out.print("Started"); 
		
		 t.join(); 
		 System.out.print("Complete"); 
		 } 
	 public void run() { 
	 for (int i= 0; i< 4; i++) { 
		 System.out.print(i); 
	 } 

	}

}
