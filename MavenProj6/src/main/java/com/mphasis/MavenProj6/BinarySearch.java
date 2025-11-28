package com.mphasis.MavenProj6;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {10,23,45,12,65,87,44,9,98};
		System.out.println("Enter key element to search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Element found at "+(mid+1)+"th position");
				break;
			}
			else if(arr[mid]<key)
				low=mid+1;
			else
				high=mid-1;
		}
		System.out.println("not found");
	}
}
