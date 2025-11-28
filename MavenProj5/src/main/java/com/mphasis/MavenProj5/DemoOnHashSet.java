package com.mphasis.MavenProj5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {

	public static void main(String[] args) {
		
		//no duplicates
		//no insertion order
		//can insert only one null 
		
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(56);
		hashset.add(34);
		hashset.add(99);
		hashset.add(23);
		System.out.println(hashset);
		hashset.add(99);
		hashset.add(99);
		hashset.add(99);
		System.out.println(hashset);
		for(Integer i:hashset)
			System.out.println(i);
		
		Iterator<Integer> itr=hashset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		hashset.forEach(i->System.out.println(i));
		hashset.forEach(System.out::println);
		hashset.add(null);
		System.out.println(hashset);
		
		
		LinkedHashSet<Integer> llHashSet=new LinkedHashSet<Integer>();
		llHashSet.add(90);
		llHashSet.add(56);
		llHashSet.add(34);
		llHashSet.add(99);
		llHashSet.add(23);
		llHashSet.add(12);
		System.out.println(llHashSet);
		
		

	}

}
