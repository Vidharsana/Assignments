package com.mphasis.MavenProj2;

public class TryWithResourcesDemo implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("resources closed successfully");
		
	}
//	public static void main(String args[]) {
//		TryWithResourcesDemo demo=new TryWithResourcesDemo();
//		try(demo){
//		System.out.println("using demo resources");
//		}
	}

//}
