package MultiThreading;

//Move the line 12 print statement into the foo() method.
//B. Change line 7 to public synchronized void go() {.

public class TestFive {
	
	 private volatile int x; 
		 public void foo() {
			// synchronized(this){
		int current = x;
		 x = current + 1;
		 System.out.print(x + ", ");	
			// }
		
		 }
		
		 public synchronized void go() {
			 for(int i=0;i<5;i++) {
			   //synchronized(this) {	 
				 new Thread() {
		 public void run() {
			 foo();
			
		   }
		 }.start();
		  
			  // }
			}
		}
		public static void main(String[] args){
			
			TestFive t=new TestFive();
			t.go();
		}
}

//E,C not
//A,B yes 
//B,c No  1, 2, 3, 4, 4, 

