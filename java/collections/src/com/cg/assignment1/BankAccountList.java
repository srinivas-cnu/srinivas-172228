package com.cg.assignment1;

public class BankAccountList {
	public static void main(String[] args)
{
		
		SavingsAccount Emp1=new SavingsAccount(100.00, 10,"tiger",true);
		SavingsAccount Emp2=new SavingsAccount(200.00, 20,"lion", false);
		SavingsAccount Emp3=new SavingsAccount(300.00, 30,"cheetah", false);
		SavingsAccount Emp4=new SavingsAccount(400.00, 40,"cub", false);
		BankAccountSet b=new BankAccountSet();
		b.AllDetails(Emp1);
		b.AllDetails(Emp2);
		b.AllDetails(Emp3);
		b.AllDetails(Emp4);
		
		for(SavingsAccount sa: b.getAllDetails()) {
				System.out.println(sa);
		}
		}
	}