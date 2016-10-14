package CollectionTests;

public class Pgm8 implements Comparable<Pgm8> {
 private int wins, losses;
	 public Pgm8(int w, int l) { wins = w; losses = l; }
	 public int getWins() { return wins; }
	 public int getLosses() { return losses; }
	 public String toString() {
	 return "<" + wins + "," + losses + ">";
	 }
	 // insert code here
	@Override
	public int compareTo(Pgm8 arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	}

