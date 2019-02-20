package com.cg.assignment1;

public class Test  {

	public static void main(String[] args) {
	 ArithmaticInterface p =(a,b) ->
			 {
    System.out.println("addition:"+ (a+b));
    System.out.println("subtract:" +(a-b));
    System.out.println("multiply:"+a*b);
    System.out.println("divide:"+a/b);
				
			 
			 };
			 p.operations(8, 5);

	}

}
