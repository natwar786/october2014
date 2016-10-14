package MultiThreading;

public class P2 extends Thread { 
	 private int x= 2; 
	 public static void main(String[] args) throws Exception { 
 new P2().makeItSo(); 
 } 
 public P2() { 
	 x=5; 
	 start(); 
 } 
	 public void makeItSo() throws Exception { 
		 System.out.println(Thread.currentThread().getName()+"before "); 
	join(); 
	System.out.println(Thread.currentThread().getName());
	 x=x- 1; 
	 System.out.println(x); 
	} 
	public void run() { x *= 2; } 
} 

/*
without join : 4
with join: 9
The join method allows one thread to wait for the completion of another. 
If t is a Thread object whose thread is currently executing,
t.join();
causes the current thread to pause execution until t's thread terminates. 
Overloads of join allow the programmer to specify a waiting period. 
However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.
Like sleep, join responds to an interrupt by exiting with an InterruptedException.
*
*/
