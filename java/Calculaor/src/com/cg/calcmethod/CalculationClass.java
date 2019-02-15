package com.cg.calcmethod;

public class CalculationClass
{

	int a;
	int b;
	int res;
	
	public int add(int a, int b)
	{
		res=a+b;
		System.out.println("Addition : "+res);		
		return res;
	}
	public void sub(int a, int b)
	{
		res=a-b;
		System.out.println("Substraction: "+res);		
	}
	public int mul(int a, int b)
	{
		res=a*b;
		System.out.println("Multiplication:"+res);
		return res;
	}
	public void div(int a, int b)
	{
	res=a/b;
	System.out.println("Division:" +res);
	}
}
