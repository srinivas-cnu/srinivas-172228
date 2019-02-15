package com.ex;

public class DemoException extends Exception {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		DemoException dm=new DemoException();
		int i, j, k=0 ;
		i = 8;
		j = 0;
		try
		{
		k = i / j;
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by zero"
					+ e );
		}
		
		System.out.println("the value is:" + k);

	}

}
