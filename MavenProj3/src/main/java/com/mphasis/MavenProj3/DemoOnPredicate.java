package com.mphasis.MavenProj3;

import java.util.function.Predicate;

public class DemoOnPredicate {

	public static void main(String[] args) {
		Predicate<Integer> isEven=(n)->n%2==0;
		System.out.println(isEven.test(56));
		
		if(isEven.test(35))
			System.out.println("even");
		else
			System.out.println("odd");
		
		System.out.println(isEven.test(78)?"even":"odd");
		
		Predicate<String> checkLength=(s)->s.length()>7;
		System.out.println(checkLength.test("vidhu"));
		
		Employee e1=new Employee(123,"vidhu",7000);
		Employee e2=new Employee(124,"thari",2000);
		Employee e3=new Employee(125,"hem",3000);
		Employee e4=new Employee(126,"anitha",4000);
		Employee e5=new Employee(127,"veena",5000);

		Employee[] eArr= {e1,e2,e3,e4,e5};
		
		Predicate<Employee> checkSalary=(emp)->emp.getSalary()>=5000;
		
		for(Employee e:eArr)
			if(checkSalary.test(e))
				System.out.println(e);

	}

}
