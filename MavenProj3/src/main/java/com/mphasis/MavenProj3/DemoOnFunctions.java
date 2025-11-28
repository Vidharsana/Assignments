package com.mphasis.MavenProj3;

import java.util.function.Function;



public class DemoOnFunctions {

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction=(num)->num*num;
		int arr[]= {3,2,5,7,1,9};
		for(int i=0;i<arr.length;i++)
			System.out.println(squareFunction.apply(arr[i]));
		
		
		Employee e1=new Employee(123,"vidhu",7000);
		Employee e2=new Employee(124,"thari",2000);
		Employee e3=new Employee(125,"hem",3000);
		Employee e4=new Employee(126,"anitha",4000);
		Employee e5=new Employee(127,"veena",5000);

		Employee[] eArr= {e1,e2,e3,e4,e5};
		
		Function<Employee,String> upperCaseFunction=(e)->e.getEmpName().toUpperCase();
		for(Employee e11:eArr)
			System.out.println(upperCaseFunction.apply(e11));
		
		Function<Integer, Integer> add20=(num)->num+20;
		System.out.println(squareFunction.andThen(add20).apply(5));
		
		
//		Function<Employee, Employee> checkSalary=(e)->{
//			if(e.getSalary()>5000)
//				return e;
//			else
//				return null;
//		};

	}

}
