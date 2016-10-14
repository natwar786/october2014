package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class NameList {
	private List names = new ArrayList();
	 public synchronized void add(String name) { names.add(name); }
	 public synchronized void printAll() {
		System.out.println(names.size()); 
	for (int i = 0; i <names.size(); i++) {
	 System.out.print(names.get(i) +" ");
	 }
	}
	 public static void main(String[] args) {
	 final NameList sl = new NameList();
	for(int i=0;i<2;i++) {
	 new Thread() {
	 public void run() {
	 sl.add("A");
	 sl.add("B");
	 sl.add("C");
	 sl.printAll();
	 }
	 }.start();
	 }
	 }
 }
//C. The code may run with no output, exiting normally.
//A B C A B C A B C
//
