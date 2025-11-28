package com.mphasis.DesignPatterns;

public class TeaMaker extends DrinkMaker{

	@Override
	void makeDrink() {
		System.out.println("Making Tea");
		
	}

	@Override
	void addExtras() {
		System.out.println("Adding ginger");
		
	}

}
