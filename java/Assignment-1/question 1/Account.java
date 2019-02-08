package com.cg.gopi;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id, String name) //2 Parameter constructor
	{
		this.id=id;
		this.name=name;
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
	}
	
	public Account(String id, String name, int balance) //3 Parameter constructor
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("BALANCE :"+balance);
	}
	public String getID() //Getting ID
	{
	  return id;
	}
	public String getName() //Getting Name
	{
	  return name;
	}
	public int getBalance()//Getting Balance
	{
	  return balance;
	}
	
	public int credit(int amount)
	{   
		System.out.println("------------------------------------------");
		balance = balance + amount;
		System.out.println("After Credited balance: "+ balance);
		return balance;
		
	}
	
	public int debit(int amount)
	{
		if(amount<=balance)
		{
			balance =  balance - amount;
			System.out.println("After debited balance: "+ balance);
			
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public int transferTo(int Account,int amount)
	{
		if(amount<=balance)
		{
			System.out.println("------------------------------------------");
			balance = balance-amount;
		 	System.out.println("Amount of Rs. "+ amount +" tranfer to A/c no."+Account);
		 	System.out.println("After transferred, the balance is :"+ balance);
			
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}	
		return balance;

	}
	@Override
	 public String toString()
	 {
		return "Account[ID =" +this.id+" ,Name ="+this.name+" ,Balance ="+this.balance+"]";		 
	 }
}
