package com.mphasis.MavenProj1;

import com.mphasis.MavenProj1.Student.College;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student(123, "swapna", 90);
		College c1=s1.new College("abc","blr",123);

	}

}
