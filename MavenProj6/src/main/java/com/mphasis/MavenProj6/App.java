package com.mphasis.MavenProj6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	Integer arr[]= {23,12,34,33,55,46,57,68,75,4,90,14};
    	//Terminal Operations
    	Arrays.stream(arr).forEach(System.out::println);
    	List<Integer> iList=Arrays.stream(arr).collect(Collectors.toList());
    	System.out.println(iList);
    	Integer min=Arrays.stream(arr).min((a,b)->a-b).get();
    	System.out.println(min);
    	min=Arrays.stream(arr).min(Integer::compare).get();
    	
    	long count=Arrays.stream(arr).count();
    	System.out.println(count);
    	
    	//sum of arrays using reduce
    	
    	int sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
    	System.out.println("Sum of Array Elements : "+sum);
    	System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));
    	
    	//Intermediate operation
    	//filter
    	System.out.println("-----------------------------Filter-------------------------");
    	Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
    	
    	//map
    	System.out.println("-----------------------------Map-------------------------");
    	Stream.of(arr).map(num->num+10).forEach(System.out::println);
    	
    	//limit
    	System.out.println("-----------------------------Limit-------------------------");
    	Stream.of(arr).limit(5).forEach(System.out::println);
    	
    	
    	System.out.println("-----------------------------Skip-------------------------");
    	Stream.of(arr).skip(5).forEach(System.out::println);
    	
    	//distinct
    	System.out.println("-----------------------------Distinct-------------------------");
    	Stream.of(arr).distinct().forEach(System.out::println);
    	
    	System.out.println("-----------------------------Distinct then count-------------------------");
    	System.out.println(Arrays.stream(arr).distinct().count());
    	System.out.println(Arrays.toString(arr));
    	
    	System.out.println("-----------------------------Any Match-------------------------");
    	System.out.println(Stream.of(arr).anyMatch(num->num>25));
    	
    	System.out.println("-----------------------------All Match-------------------------");
    	System.out.println(Stream.of(arr).allMatch(num->num>25));
    	
    	System.out.println("-----------------------------None Match-------------------------");
    	System.out.println(Stream.of(arr).anyMatch(num->num>25));
    	
    	System.out.println("-----------------------------Find First-------------------------");
    	System.out.println(Stream.of(arr).filter(num->num>25).findFirst().get());
    	
    	
    	Integer[] nums= {23,12,45,56,25,78,12,45,45,34,23,78,48,90,33,94};
    	List<Integer> numList=Arrays.asList(nums);
    	numList.stream().filter(num->num%3==0)
    	.distinct()
    	.skip(2)
    	.limit(2)
    	.forEach(System.out::println);
    	
    	System.out.println("-----------------------------Sorted-------------------------");
    	numList.stream().sorted().forEach(System.out::println);
    	
    	System.out.println("----------------------------- Reverse Sorted-------------------------");
    	numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	
    	//using stream of strings
    	
    	String[] names={"swapna","amit","swathi","pooja","vikky","raj","smit"};
    	Arrays.stream(names)
    	.filter(name->name.length()>=5)
    	.filter(name->name.startsWith("s"))
    	.sorted()
    	.forEach(System.out::println);
    	
    	
    	//streams of user defined object collection
    	System.out.println("----------------------------- streams of user defined object collection-------------------------");
    	Employee emp1=new Employee(123,"swapna",70000,"trainer","training");
    	Employee emp2 = new Employee(124, "Rahul", 85000, "Developer", "IT");
    	Employee emp3 = new Employee(125, "Priya", 95000, "Manager", "HR");
    	Employee emp4 = new Employee(126, "Arjun", 40000, "Analyst", "Finance");
    	Employee emp5 = new Employee(127, "Meena", 32000, "Designer", "Marketing");
    	Employee emp6 = new Employee(128, "Karthik", 80000, "Tester", "QA");
    	//Employee[] empList= {emp1,emp2,emp3,emp4,emp5,emp6};
    	ArrayList<Employee> eList=new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6));
    	eList.stream().filter(emp->emp.getSalary()>50000).forEach(System.out::println);
    	System.out.println("----------------------------------------------------------------------------");
    	eList.stream().filter(emp->emp.getDesg().equals("manager")).forEach(System.out::println);
    	
    }
}
