package CollectionTests;

import java.util.HashSet;

public class Pgm13 {

	private String name;
	public Pgm13(String name) { this.name = name; }
	public boolean equals(Pgm13 p) {
		 return p.name.equals(this.name);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm13 p1=new Pgm13("ram");
		Pgm13 p2=new Pgm13("ram");
		HashSet<Pgm13> sets=new HashSet<Pgm13>();
		sets.add(p1);
		sets.add(p2);
		System.out.println(sets.size());
	}

}
