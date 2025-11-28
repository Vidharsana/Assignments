package com.mphasis.MavenProj5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {

	public static void main(String[] args) {
		
		//ArrayList using primitive types
		
//		ArrayList alist=new ArrayList();
//		alist.add(56);
//		alist.add("swapna");
//		alist.add(true);
//		alist.add(89.78);
//		Person p=new Person("swapna",1234);
//		alist.add(p);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//
//		alist.add(56);
//		alist.add("swapna");
//		alist.add(true);
//		alist.add(89.78);
//		System.out.println(alist);
//		alist.add(null);
//		alist.add(null);
//		System.out.println(alist);
//		
//		//with generics
//		//first approach
//		ArrayList<String> namesList=new ArrayList<String>();
//		namesList.add("amit");
//		namesList.add("Preethi");
//		namesList.add("varun");
//		namesList.add("keerthi");
//		System.out.println(namesList);
//		
//		//enhanced for loop
//		//second approach
//		for(String name:namesList)
//			System.out.println(name);
//		
//		//using iterator
//		//third approach
//		Iterator<String> itr=namesList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		//one more iterator available(List Iterator)
//		ListIterator<String> litr=namesList.listIterator();
//		while(litr.hasNext())
//			System.out.println(litr.next());
//		while(litr.hasPrevious())
//			System.out.println(litr.previous());
//		
//		System.out.println(namesList.contains("amit"));
//		
//		System.out.println("ForEach");
//		namesList.forEach(name->System.out.println(name));//using lambda
//		namesList.forEach(System.out::println);//method reference
//		
//		//System.out.println(namesList.remove(2) + " is removed");
//		
//		Integer[] arr= {2,3,4,5,6,7};
//		Integer[] brr= {1,2,3,4,5};
//		
//		List<Integer> numsList1=new ArrayList<>(Arrays.asList(arr));
//		List<Integer> numsList2=new ArrayList<>(Arrays.asList(brr));
//		System.out.println("Before retainsAll operation "+numsList1);
//		numsList1.retainAll(numsList2);
//		System.out.println("After retain all operation "+numsList1);
//		
//		System.out.println("NamesList : "+namesList);
//		
//		Collections.sort(namesList);
//		System.out.println("After sorting \n"+namesList);
//		
//		ArrayList<String> clonedNamesList=(ArrayList<String>) namesList.clone();
//		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
//		
//		//clonedNamesList.add("swapna");
//		namesList.add("swapna");
//		System.out.println(clonedNamesList.hashCode());
//		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
		
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(123,"Swapna ",44,"Hyderabad",90));
		studentList.add(new Student(124,"Vidhu ",21,"Banglore",80));
		studentList.add(new Student(125,"Thari ",18,"Coimbatore",98));
		studentList.add(new Student(126,"Hem ",13,"Ooty",95));
		studentList.add(new Student(127,"Libi ",22,"Chennai",92));
		studentList.add(new Student(133,"Swathi ",44,"Hyderabad",90));
		studentList.add(new Student(134,"Vidharsana ",21,"Banglore",20));
		studentList.add(new Student(135,"Tharika ",18,"Coimbatore",58));
		studentList.add(new Student(136,"Hemanth ",13,"Ooty",65));
		studentList.add(new Student(137,"Libisena ",22,"Chennai",82));
		studentList.add(new Student(143,"Sibu ",44,"Hyderabad",30));
		studentList.add(new Student(144,"Aadhi ",21,"Banglore",70));
		studentList.add(new Student(145,"Rose ",18,"Coimbatore",58));
		studentList.add(new Student(146,"Kiran",13,"Ooty",45));
		studentList.add(new Student(147,"Keerthu ",22,"Chennai",72));
		
//		System.out.println(studentList);
		
		for(Student s:studentList)
			System.out.println(s);
		
		//Collections.sort(studentList);
		studentList.sort(new CityComparator()
				.thenComparing(new NameComparator())
				.thenComparing(new MarksComparator()));
		System.out.println("\n***************************** After sorting*******************************\n");
		for(Student s1:studentList)
			System.out.println(s1);
		
		
		
	}

}
