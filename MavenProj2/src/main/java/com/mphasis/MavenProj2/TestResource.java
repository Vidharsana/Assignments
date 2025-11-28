package com.mphasis.MavenProj2;

public class TestResource {

	public static void main(String[] args) throws Exception{
		TryWithResourcesDemo demo = new TryWithResourcesDemo();
		DemoOnFileNotFound dof=new DemoOnFileNotFound();
		try(demo;dof){
			System.out.println("using demo resources");
		}
	}

}
