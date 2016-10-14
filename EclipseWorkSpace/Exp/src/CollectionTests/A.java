package CollectionTests;

import java.util.ArrayList;
import java.util.Arrays;

public class A {
	

	public static void main(String[] args) {
		
		 Object [] myObjects = {new Integer(12),new String("foo"),new Integer(5),new Boolean(true)};
		// TODO Auto-generated method stub
		 for(int i=0;i<myObjects.length;i++) {
			 System.out.println(myObjects[i]);
		 }
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 
		 	String s= "hello";  s.length();
		 
		 	char[] arr={'a','c'};
           Arrays.sort(myObjects);
		// Arrays.sort(myObjects);
		 for( int i=0; i<myObjects.length; i++) {
		 System.out.print(myObjects[i]);
		 System.out.print(" ");

	}

 }
}	
