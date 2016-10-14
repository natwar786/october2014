package Exp1;

//http://www.geeksforgeeks.org/power-set/
public class powerSet {
     
	static void printPowerSet(char[] set, int set_size)
	{
	    /*set_size of power set of a set with set_size
	      n is (2**n -1)*/
	     int pow_set_size = (int) Math.pow(2, set_size);
	    int counter, j;
	 
	    /*Run from counter 000..0 to 111..1*/
	    for(counter = 0; counter < pow_set_size; counter++)
	    {
	      for(j = 0; j < set_size; j++)
	       {
	          /* Check if jth bit in the counter is set
	             If set then pront jth element from set */
	          if((counter & (1<<j))>0)
	            System.out.printf("%c", set[j]);
	       }
	       System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char set[] = {'a','b','c'};
	    printPowerSet(set, 3);
	}

}
/*
 Depth First Traversals:
(a) Inorder
    Algorithm Inorder(tree)
   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   2. Visit the root.
   3. Traverse the right subtree, i.e., call Inorder(right-subtree)

(b) Preorder
Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree) 

(c) Postorder
  Algorithm Postorder(tree)
   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   3. Visit the root.
 */ 
