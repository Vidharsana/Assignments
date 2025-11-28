package com.mphasis.MavenProj3;

import java.util.Arrays;
import java.util.function.Consumer;


public class DemoOnCustomer {

	public static void main(String[] args) {
		Consumer<Integer> squareConsumer=(num)->{
//			num=num*num;
			System.out.println(num*num);
		};
		
		squareConsumer.accept(5);
		
		Consumer<Integer[]> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		
		Integer[] arr= {45,23,78,12,99,42,1};
		sortConsumer.accept(arr);
		
		
		Employee e1=new Employee(123,"vidhu",7000);
		Employee e2=new Employee(124,"thari",2000);
		Employee e3=new Employee(125,"hem",3000);
		Employee e4=new Employee(126,"anitha",4000);
		Employee e5=new Employee(127,"veena",5000);

		Employee[] eArr= {e1,e2,e3,e4,e5};
		
		Consumer<Employee[]> printConsumer=(err)->{
			for(Employee e:err)
				System.out.println(e.getEmpName());
		};
		
		printConsumer.accept(eArr);
		
		
		
	}

	}


