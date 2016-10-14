package ExceptionHandlings;

public class Pgm1 {
	private static int seed;

	@SuppressWarnings("finally")
	public int luckyNumber(int seed)
	{
		if(seed > 10) return seed%10;
		int x = 0;
		try
		{
			if(seed%2 == 0) throw new Exception("No Even no.");
			else return x;
		}
		catch(Exception e)
		{
			System.out.println("exception catched");
			return 3;
		}
		finally
		{
			System.out.println("finally");
			return 7;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 100;
		seed = 6;
		switch( new Pgm1().luckyNumber(6) ) {
			case 3: amount = amount * 2;System.out.println("case 3"+amount);
			case 7: amount = amount * 2;System.out.println(amount+"case 7");
			case 6: amount = amount + amount;System.out.println("case 6 "+amount);
 			default :
		}
		System.out.println(amount+"Final output");
	}

	}


