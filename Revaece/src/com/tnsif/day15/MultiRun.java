package com.tnsif.day15;

public class MultiRun implements Runnable{
	
	public void run() {
	try {
		
		System.out.println("thread" +Thread.currentThread().getId()+"is running" );
	}
    catch(Exception e)
	{
    	System.out.println("Exception is caught");
	}
}
}