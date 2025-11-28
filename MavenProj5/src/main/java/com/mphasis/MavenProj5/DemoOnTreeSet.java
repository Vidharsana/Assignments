package com.mphasis.MavenProj5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(34);
		treeSet.add(12);
		treeSet.add(90);
		treeSet.add(56);
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(39));
		System.out.println(treeSet.floor(39));
		
		Iterator<Integer> itr=treeSet.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(treeSet.headSet(56));
		System.out.println(treeSet.tailSet(56));
		System.out.println(treeSet.higher(35));
		
		
		
		TreeSet<Student> studentList1=new TreeSet<Student>();
		studentList1.add(new Student(123,"Swapna ",44,"Hyderabad",90));
		studentList1.add(new Student(124,"Vidhu ",21,"Banglore",80));
		studentList1.add(new Student(125,"Thari ",18,"Coimbatore",98));
		studentList1.add(new Student(126,"Hem ",13,"Ooty",95));
		studentList1.add(new Student(127,"Libi ",22,"Chennai",92));
		
		for(Student s:studentList1)
			System.out.println(s);
		
	}

	


}
