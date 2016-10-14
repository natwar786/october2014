package ExceptionHandlings;

import java.io.IOException;
import java.sql.SQLException;

public class P5 {
	void m1() throws Exception
	{
	   try
	   {
	      // line1
		   throw new SQLException();
	   }
	   catch (IOException e)
	   {
	       throw new SQLException();
	   }
	   catch(SQLException e)
	   {
	       throw new InstantiationException();
	   }
	   finally
	   {
	      throw new CloneNotSupportedException();  // this is not a RuntimeException.
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
