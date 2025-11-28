package com.mphasis.MavenProj2;

public class Fruits {
	private String fruitName;
	private String fruitColor;
	private double fruitCost;
	public Fruits(String fruitName, String fruitColor, double fruitCost) {
		super();
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.fruitCost = fruitCost;
	}
	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitColor() {
		return fruitColor;
	}
	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	public double getFruitCost() {
		return fruitCost;
	}
	public void setFruitCost(double fruitCost) {
		this.fruitCost = fruitCost;
	}
	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", fruitColor=" + fruitColor + ", fruitCost=" + fruitCost + "]";
	}
	
	public double calculatorCostPerDozen() {
		return this.fruitCost*12;
	}
	
}
