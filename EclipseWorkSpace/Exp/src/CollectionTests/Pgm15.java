package CollectionTests;

import java.util.HashSet;
import java.util.Set;

class KeyMaster {
public int i;public KeyMaster(int i) { this.i = i; }
public boolean equals(Object o) { System.out.println(i+"eq ");   return i == ((KeyMaster)o).i; }
 public int hashCode() { System.out.println(i+"hs");return i; }
 }


public class Pgm15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<KeyMaster> set = new HashSet<KeyMaster>();
		 KeyMaster k1 = new KeyMaster(1);
		 KeyMaster k2 = new KeyMaster(2);
		 set.add(k1); set.add(k1);
		 //set.add(k1);set.add(k1);
		 set.add(k2); set.add(k2);
		 System.out.println(set.size() + ":--");
		 //k2.i = 1;
		 k2.i = 2;
		 System.out.println(set.size() + ": *");
		 set.remove(k1);
		 System.out.println(set.size() + ": ++ ");
		 set.remove(k2);
		 System.out.println(set.size()+"--size--");
		// System.out.println(set);

    
	}

}
