package com.mphasis.MphasisProj05;

import java.util.Arrays;

public class Calculator {

	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public int[] checkArrays() {
		int arr[]= {1,2,3,4,5};
		
		return arr;
	}
	
	
	public ArithmeticException checkAE() {
		return new ArithmeticException();
	}
	
}
