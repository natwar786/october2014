package MultiThreading;

public class P1 implements Runnable { 
	 public void run() { 
	 System.out.print("running"); 
		 } 
	 public static void main(String[] args) { 
	 Thread t = new Thread(new P1()); 
	 t.run(); 
		 t.run(); 
		 t.start(); 
		 } 
		 } 
		/* What is the result? 
		 Compilation fails. 
		 An exception is thrown at runtime. 
		 The code executes and prints “running”. 
		 The code executes and prints “runningrunning”. 
	    The code executes and prints “runningrunningrunning”.*/ 

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

/*
monitor : 
 
 */
