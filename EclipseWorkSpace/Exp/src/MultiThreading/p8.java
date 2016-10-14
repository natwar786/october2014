package MultiThreading;

public class p8 {
	public class TestOne { 
		 public static void main (String[] args) throws Exception { 
		 Thread.sleep(3000); 
		System.out.println(”sleep”); 
		 } 
		 } 
		/*What is the result? 
		Compilation fails. 
	An exception is thrown at runtime. 
		 The code executes normally and prints “sleep”. 
	The code executes normally, but nothing is printed. */

}
