package com.mphasis.MavenProj1;

public class Calculator implements ScientificCalculatorInterface {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(float a,float b) {
		System.out.println(a+b);
	}
	public void add(long l,double d) {
		System.out.println(l+d);
	}
	@Override
	public double power(double m,double n) {
		return Math.pow(m, n);
	}
	
	@Override
	public double squareRoot(double m) {
		
		return Math.sqrt(m);
	}
	@Override
	public double logValue(double m) {
		
		return Math.log(m);
	}
	public static void main(String args[]) {
		Calculator c=new Calculator();
		c.add(5, 10);
		c.squareRoot(25);
		c.power(2, 2);
	}
}
