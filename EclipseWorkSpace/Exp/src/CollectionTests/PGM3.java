package CollectionTests;

import java.util.Collection;
import java.util.LinkedList;

public class PGM3 {

	 public static Collection get() {
		 Collection sorted = new LinkedList();
		 sorted.add("B"); 
		 sorted.add("C"); 
		 sorted.add("A");
		 return sorted;
		 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Object obj: get()) {
			 System.out.print(obj + ", ");

	}

}
}
