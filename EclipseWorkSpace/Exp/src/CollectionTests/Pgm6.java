package CollectionTests;

import java.util.HashSet;

public class Pgm6 {
	 private String s;
	 public Pgm6(String s) { this.s = s; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs = new HashSet<Object>();
		Pgm6 ws1 = new Pgm6("aardvark");
		Pgm6 ws2 = new Pgm6("aardvark");
		Pgm6 ws3 = new Pgm6("aardvark");
		 String s1 = new String("aardvark");
	 String s2 = new String("aardvark");
	 String s3 = new String("aardvark");
	 String s4 = new String("aardvark");
	 String s5 = new String("aardvark");
		 hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);
		 hs.add(s3);hs.add(ws3);
		 hs.add(s4);
		 hs.add(s5);
		 System.out.println(hs.size()); } }

	