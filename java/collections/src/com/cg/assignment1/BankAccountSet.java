package com.cg.assignment1;

import java.util.TreeSet;

public class BankAccountSet 
{
	TreeSet<SavingsAccount> set=new TreeSet<SavingsAccount>();
	public void AllDetails(SavingsAccount acc)
	{
		
		set.add(acc);
	}
public TreeSet<SavingsAccount> getAllDetails()
{
	return set;
}
}
