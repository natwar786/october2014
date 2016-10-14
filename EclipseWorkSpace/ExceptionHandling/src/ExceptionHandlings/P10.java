package ExceptionHandlings;

public class P10 {
    public String checkIt(String s)
    {
	if(s.length() == 0 || s == null)
	{
	    return "EMPTY";
	}
	else return "NOT EMPTY";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P10 a = new P10();
		a.checkIt(null);

	}

}
