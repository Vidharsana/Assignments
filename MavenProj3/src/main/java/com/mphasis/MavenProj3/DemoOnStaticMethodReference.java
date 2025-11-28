package com.mphasis.MavenProj3;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnStaticMethodReference {

	//classname::methodname
	//objname::method
	
	static class NumberUtil{
		public static int squareNum(int num) {
			return num*num;
		}
		
		public static double log(Double num) {
			return Math.log(num);
		}
		
		public static boolean isEven(int num) {
			return num%2==0;
		}
		
	}
		
		static class StringUtil{
			public static int strlen(String s) {
				return s.length();
			
		}
	}
	
	public static void main(String[] args) {
		Function<Integer,Integer> squareFunctionUsingLambda=(num)->NumberUtil.squareNum(num);
		
		Function<Integer, Integer> squareFunctionMR=NumberUtil::squareNum;
		
		System.out.println(squareFunctionUsingLambda.apply(5));
		System.out.println(squareFunctionMR.apply(8));
		
		Function<Double, Double> logUsingMR=NumberUtil::log;
		Function<Double, Double> logUsingLambda=(num)->NumberUtil.log(num);
		
		System.out.println(logUsingLambda.apply(6.0));
		System.out.println(logUsingMR.apply(6.0));
		
		Predicate<Integer> isEvenUsingLambda=(num)->NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR=NumberUtil::isEven;
		
		String name="vidhu";
		Function<String,Integer> strlenUsingLambda=(name1)->StringUtil.strlen(name);
		Function<String, Integer> strlenUsingMR=StringUtil::strlen;
		
		System.out.println(strlenUsingLambda.apply("vidhu"));
		System.out.println(strlenUsingMR.apply("vidhu"));
		
	}
	
}
