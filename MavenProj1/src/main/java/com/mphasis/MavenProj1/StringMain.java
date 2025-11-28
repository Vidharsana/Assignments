package com.mphasis.MavenProj1;

public class StringMain {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s.hashCode());
		s="helloWorld";
		System.out.println(s.hashCode());
		String s1="hello";
		System.out.println(s1.hashCode());
		String s2=new String("hello");
		System.out.println(s2.hashCode());
		System.out.println(s.length());
		System.out.println(s.indexOf('w'));
		String s3="Mphasis";
		System.out.println(s2.concat(s3));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s.substring(5,10));

	}

}
