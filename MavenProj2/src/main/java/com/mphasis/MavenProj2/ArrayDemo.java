package com.mphasis.MavenProj2;

public class ArrayDemo {

	public static void main(String[] args) {
		Fruits farr[]=new Fruits[5];
		Fruits  f1 = new Fruits("apple","red",35.50);
		Fruits  f2 = new Fruits("mango","yellow",80.90);
		Fruits  f3 = new Fruits("orange","orange",10);
		Fruits  f4 = new Fruits("watermelon","green",80);
		Fruits  f5 = new Fruits("banana","yellow",10);
		
		farr[0]=f1;
		farr[1]=f2;
		farr[2]=f3;
		farr[3]=f4;
		farr[4]=f5;
		
		for(int i=0;i<farr.length;i++)
			System.out.println("Cost per Dozen for "+farr[i].getFruitName()+" is "+farr[i].calculatorCostPerDozen());
		
	}

}
