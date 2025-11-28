package com.mphasis.MavenProj1;

/**
 * Hello world!
 */
public class App {
	
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}
	
	public static void main() {
		System.out.println("my own main method");
	}
	
    public static void main(String[] args) {
        Student s1=new Student(123,"swapna",90);
        Student s2=new Student(123,"swapna",90);
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
