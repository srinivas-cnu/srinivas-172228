package com.assign3;

public class Account2 {
	public static void main(String[] args) 
	{
		Customer c=new Customer(1,"Gopi",20);
		System.out.println(c);
		Account a=new Account();
		a.setBalance(890.367788);
		a.credit(2000.3789);
		System.out.println(a);
		a.withdraw(899.2898);
		System.out.println(a);

	}

}
