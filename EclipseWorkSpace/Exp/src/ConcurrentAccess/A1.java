package ConcurrentAccess;

public class A1 implements Runnable {

	public  synchronized void m1() {
		System.out.println("m1 starts");
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1 finish");
		//m2();
	}
	
   public  synchronized void m2() {
	   System.out.println("m2 starts");
	   try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   System.out.println("m2 finish");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		Thread t=new Thread(a,"first");
		Thread t1=new Thread(a,"second");
	    t.start();
	    t1.start();
	    if(Thread.currentThread().getName().equals("first")){
	    	a.m1();
	    }
	    else {
	    	a.m2();
	    }
	    Integer aI =0;
	    Integer bI=127;
	    if(aI==bI) {
	      System.out.println("equal");
	    }
	    /*m1();
	    m2();*/
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		m1();
		//m2();
	}

}
/*
 * normal both syncronized concurrent access possible
 * one normal one static both syncronized concurrent possible
 * different object has differenrt key
 * object levle key and class level key.
 * join method: 
 * 
 * 
*/