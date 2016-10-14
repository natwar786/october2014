package MultiThreading;

public class NamedCounter implements Runnable{
	private final String name;
	private int count;
	public  NamedCounter(String name) { this.name = name; }
	public  String getName() { return  name; }
	public synchronized void increment() { count++; }
	public synchronized int getCount() { return count; }
	public synchronized void  reset() { count = 0; }
	public static void main(String[] args){
		NamedCounter nc =new NamedCounter("hello");
		Thread t1=new Thread(nc,"first");
		Thread t2=new Thread(nc,"second");
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		if(t1.getName().equals("first")){
			System.out.println("if statement");
			nc.increment();
			System.out.println(nc.getCount());
		}
		else if(t1.getName().equals("second")){
			//nc.reset();
			System.out.println(nc.getCount());
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
