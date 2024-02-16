package com.tnsif.day15;

public class MultiThreadingDemo {

	public static void main(String[] args) {

         int n =7; // no of threads
         for(int i=0; i< n; i++)
         {
        	 Mulithreading obj = new Mulithreading();
        	 obj.start();
         }
         

	}

}