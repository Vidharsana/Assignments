package com.mphasis.MavenProj5;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	System.out.println("Immutable class creation");
    	System.out.println(" 1.Class need to be final"
    			+ " \n 2.Properties need to be final "
    			+ "\n 3.properties need to get value through constructor"
    			+ "\n 4.No setter to modify data");
       Person p1=new Person("swapna Motupally",1234);
       System.out.println(p1);
       
    }
}
