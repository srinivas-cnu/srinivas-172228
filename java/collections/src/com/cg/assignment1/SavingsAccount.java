package com.cg.assignment1;

public class SavingsAccount implements Comparable<SavingsAccount>{
	
	private double acc_balance;
	private int acc_id;
	private String accountHolderName;
	private boolean isSalaryAccount;
	
	



	public SavingsAccount(double acc_balance, int acc_id, String accountHolderName,boolean isSalaryAccount)
			{
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.accountHolderName = accountHolderName;   
		this.isSalaryAccount= isSalaryAccount;
	}              
	
	

	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}



	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double withdraw(int amount)
	{
		if(acc_balance >= amount)
		{
			acc_balance=acc_balance - amount;
		}
		
		
		else 
			{
			System.out.println("Insufficient balance");
		}
		return acc_balance;
	}
	
	

	
	public double deposit(int amount)
	{
		acc_balance=acc_balance + amount;
	
       return acc_balance;
}

	@Override
	public int compareTo(SavingsAccount s) {
		
		return s.acc_id-this.acc_id;
	}


	@Override
	public String toString() {
		return "SavingsAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}



	



}
