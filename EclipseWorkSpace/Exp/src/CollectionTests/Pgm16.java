package CollectionTests;

public class Pgm16 {
    private int a; 
    private int b; 
    public void setA(int i){ this.a = i; } 
    public int getA(){ return this.a; } 
    public void setB(int i){ this.b = i; } 
    public int getB(int b){ return b; } 
    public boolean equals(Object obj) 
    { 
        return ( obj instanceof Pgm16 && this.a == ((Pgm16) obj).a ); 
    } 
    public int hashCode() 
    { 
        //1 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
