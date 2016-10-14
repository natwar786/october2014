package CollectionTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pgm2 {

	public static Iterator reverse(List list) {
		 Collections.reverse(list);
		 return list.iterator();
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(" 1"); list.add("2"); list.add("3");
		for (Object obj: reverse(list)) {
		  System.out.print(obj + ",");
		}

	}

}
