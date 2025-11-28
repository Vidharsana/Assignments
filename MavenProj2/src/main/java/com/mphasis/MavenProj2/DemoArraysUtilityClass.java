package com.mphasis.MavenProj2;

import java.util.Arrays;

public class DemoArraysUtilityClass {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,11,7,2};
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr);
		System.out.println(nums);
		Arrays.sort(arr);
		for(int ele:arr)
			System.out.println(ele);
		
		System.out.println(Arrays.binarySearch(arr, 30));
		int[] arr1= {10,20,30,40,11,7,2};
		Arrays.sort(arr1);
		System.out.println(Arrays.equals(arr, arr1));
		int[] arr2=Arrays.copyOf(arr, 10);
		for(int ele:arr2)
			System.out.println(ele);
		
		Arrays.fill(arr, 78);
		for(int ele:arr)
			System.out.println(ele);
		
	}

}
