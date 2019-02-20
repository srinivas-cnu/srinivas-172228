package com.cg.Assignment2;

public class OrderTest {

	public static void main(String[] args) {
		OrderPrice op=(n,s)->{ 
	     if(n>10000)
	     {
	    	 System.out.println("price is" +  n + "status is" + s);
	     }
	     else
	     {
	    	 System.out.println("price is" + n + "status is" + s);
	     }
		
			};
				op.compare(5000, "rejected");
				op.compare(15000, "accepted");
				op.compare(20000, "accepted");
				op.compare(10000,"accepted");
				op.compare(3000, "rejected");
				}
}