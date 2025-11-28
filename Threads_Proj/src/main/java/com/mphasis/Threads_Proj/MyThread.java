package com.mphasis.Threads_Proj;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("thread "+this.getName()+" is running....");
		for(int i=1;i<=5;i++)
			System.out.println(this.getName()+" value : "+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		t.start();
		t1.start();

	}

}
