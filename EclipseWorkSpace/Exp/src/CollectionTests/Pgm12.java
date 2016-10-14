package CollectionTests;

import java.util.HashSet;

public class Pgm12 {
	 private String name;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pgm12(String name) {
		 this.name = name;
	 }

	 public boolean equals(Object o) {
		  if( !(o instanceof Pgm12) ) return false;
		  Pgm12 p = (Pgm12) o;
		 return p.name.equals(this.name);
		 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm12 p1=new Pgm12("ram");
		Pgm12 p2=new Pgm12("ram");
	HashSet<Pgm12> set=new HashSet<Pgm12>();
	set.add(p1);
	set.add(p2);
	System.out.println(set);
	System.out.println(set.size());
	}

}
