package CollectionTests;

import java.util.HashSet;

public class Pgm10 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1=new A1("ram",1,"ram");
		A1 a2=new A1("ram",1,"ram");
		HashSet<A1> set=new HashSet<A1>();
	  System.out.println(a1.getName());
	  System.out.println(a2.getName());
	  set.add(a1);
	  set.add(a2);
	  System.out.println(set.size());
	}

}
class A1 {
	@Override
	public int hashCode() {
		System.out.println("hashcode ");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals ");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof A1)) {
			return false;
		}
		A1 other = (A1) obj;
		if (age != other.age) {
			return false;
		}
		if (comment == null) {
			if (other.comment != null) {
				return false;
			}
		} else if (!comment.equals(other.comment)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	private String name, comment;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	 public A1(String n, int a, String c) {
	   name = n; 
	   age = a; 
	   comment = c;
	 }
	 
	 //@Override
	/* public boolean equals(Object o) {
		 System.out.println("equals");
		  if(! (o instanceof A)) return false;
		  A1 p = (A1)o;
		  return age == p.age && name.equals(p.name) ;
	 }
  @Override
   public int hashcode() {
   	 System.out.println("hashcode");
   //return super.hashCode();
   //return name.hashCode() + comment.hashCode() / 2 - age * 3;
   	//return name.hashCode() + comment.hashCode() / 2 - age * 3;
   return this.name.length();
   }*/
}