package CollectionTests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Pgm7 {

	enum Example { ONE, TWO, THREE };
	
		// TODO Auto-generated method stub
		
		 public static void main(String[] args) {
		Collection coll = new ArrayList();
		 coll.add(Example.THREE);
		 coll.add(Example.THREE);
		 coll.add(Example.THREE);
		coll.add(Example.TWO);
		 coll.add(Example.TWO);
		coll.add(Example.ONE);
		 Set set = new HashSet(coll);
      System.out.println(set);
		
	}

}
