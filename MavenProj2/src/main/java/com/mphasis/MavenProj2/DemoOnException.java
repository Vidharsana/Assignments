package com.mphasis.MavenProj2;

public class DemoOnException {

	public static void main(String[] args) {
		int a=5,b[]= {2,3,4,5};
		String s=null;
		try {
			for(int i=0;i<b.length;i++)
			System.out.println(a/b[i]);
			System.out.println(s.charAt(2));
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Application closed Successfully");
	}

}
