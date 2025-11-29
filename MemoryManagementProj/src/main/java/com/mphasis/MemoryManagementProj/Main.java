package com.mphasis.MemoryManagementProj;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println("object creating");
			MyClass.listItem.add(new int[10000000]);
			
		}
	}
}


class MyClass{
	static List<int[]> listItem=new ArrayList<int[]>();
}