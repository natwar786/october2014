package MultiThreading;

public class Threads3 implements Runnable {
	 public void run() {
		 System.out.println("running");
		 }
   public static void main(String[] args) {
	   Threads3 x=new Threads3();
	   Thread t = new Thread(x);
		t.run();
		 t.run();
	    t.start();
	    x.run();
		 }
	 }
