package com.mphasis.MavenProj2;

public class MyCalculator {
	public static void main(String args[]) {
//		Calculator mc =(int a,int b)->a+b;
//		System.out.println(mc.add(5, 6));
		
//		Calculator c=(int a,int b)->System.out.println(a-b);
//		c.sub(9, 5);
		
//		Calculator c =()->{
//			int a=9,b=5;
//			System.out.println(a*b);
//		};
//		c.mul();
		
		Calculator c=()->{
			int a=8,b=3;
			return((float)a/b);
		};
		System.out.println(c.div());
		
	}
}
