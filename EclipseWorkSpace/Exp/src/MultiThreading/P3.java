package MultiThreading;

public class P3 implements Runnable { 
	// public class Threads2 
		 public void run() { 
		 System.out.println("run."); 
		 throw new RuntimeException("Problem"); 
		} 
	public static void main(String[] args) { 
		 Thread t = new Thread(new P3()); 
	 t.start(); 
	System.out.println("End of method."); 
	 } 
	 } 


