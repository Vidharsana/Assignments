package com.mphasis.Threads_Proj;

public class RunnableThread implements Runnable{

	public static void main(String[] args) {
		

		Thread t=new Thread(new RunnableThread());
		t.start();
	}

	@Override
	public void run() {
		System.out.println("thread "+Thread.currentThread().getName()+" is running....");
		
	}

}
