package ExceptionHandlings;

public class P3 {
    public static void doA(int k) throws Exception { // 0
        for(int i=0; i< 10; i++) {
            if(i == k) throw new Exception("Index of k is "+i); // 1
        }
    }
    public void doB(boolean f) throws Exception { //2
        if(f) {
            doA(15); //3
        }
        else return;
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		P3 a = new P3();
        a.doB(args.length>0); //5

	}

}
