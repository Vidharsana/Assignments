package com.mphasis.MavenProj2;

public class CustomExceptions {

	public static void main(String[] args) {

		Person p=new Person("vidhu",123,1);
		System.out.println(p);
		try {
			p.checkEligibility();
		} catch (AgeNotSufficientExceptions e) {
			
			e.printStackTrace();
		}
		System.out.println("application closed");
	}

}
