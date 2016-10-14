package MultiThreading;

public class A {
	public static  void doStuff(){
		System.out.println("hello: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		 /*new Thread(new Runnable() {
			 public void run() { doStuff(); }
			 }).start();*/
		/*new Thread() {
			public void run() { doStuff(); }
			} .start();*/
		new Thread(new Runnable() {
			 public void run() { doStuff(); }
			 }).start();
		
	
	}
	

}

//solution :F 
//
