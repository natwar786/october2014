package Lambda;
interface MathOperation{
	int operation(int a,int b);
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation a=new MathOperation() {

			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		};
		System.out.println(a.operation(10, 20));
		MathOperation m2=(int c,int d) -> {
			return c+d;
		};
		System.out.println(m2.operation(10, 20));
		MathOperation m3=(int c,int d) -> c+d;
			 
		
	   int a1;
	   int b1=100;
	   if(true){
		   a1=100;
	   }
	   System.out.println(a1);
		
	}

}
