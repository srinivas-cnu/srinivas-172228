package com.cg.gopi;

public class MainClass {

	public static void main(String[] args) 
	{
		 Account ac1 = new Account("12","GOPI",10000);
		    ac1.credit(2000);
		    ac1.debit(5000);
		    ac1.transferTo(123, 5523);
		    System.out.println(ac1);  

	}

}
