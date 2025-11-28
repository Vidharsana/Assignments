package com.mphasis.MavenProj3;

import java.util.Arrays;


public class App1 {

	public static void main(String[] args) {
		Employee e1=new Employee(123,"vidhu",7000);
		Employee e2=new Employee(124,"thari",2000);
		Employee e3=new Employee(125,"hem",3000);
		Employee e4=new Employee(126,"anitha",4000);
		Employee e5=new Employee(127,"veena",5000);

		Employee[] eArr= {e1,e2,e3,e4,e5};
		
//		Comparator c=(e11,e22)->Double.compare(e11.getSalary(),e22.getSalary());
//		Arrays.sort(eArr,(e33,e44)->c.salComparator(e33,e44));
		
		
		Arrays.sort(eArr,(e11,e22)->e11.getEmpName().compareTo(e22.getEmpName()));
		for(Employee e:eArr)
			System.out.println(e);
		
		
		
	}
}
