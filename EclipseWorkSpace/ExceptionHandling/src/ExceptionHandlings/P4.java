package ExceptionHandlings;


class MyException extends Throwable{}
class MyException1 extends MyException{}
class MyException2 extends MyException{}
class MyException3 extends MyException2{}

public class P4 {
	void myMethod() throws MyException
	{
		throw new MyException3();
	}
	public static void main(String[] args)
	{
		P4 et = new P4();
		try
		{
			et.myMethod();
		}
		catch(MyException me)
		{
			System.out.println("MyException thrown");
		}
		catch(MyException3 me3)
		{
			System.out.println("MyException3 thrown");
		}
		finally
		{
			System.out.println(" Done");
		}
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
