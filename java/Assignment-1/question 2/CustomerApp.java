package com.cg.gopi;

//import com.cg.Customer1;
//import com.cg.DiscountRate;
//import com.cg.Visit;

public class CustomerApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer1 c=new Customer1("SBI");
	
	c.setMemberType("premium");
	 c.isMember(true);
Visit v=new Visit();
v.setServiceExpense(10000);
v.setProductExpense(5000);
v.getTotalExpense();
DiscountRate d=new DiscountRate();
d.serviceDiscountRate();
d.productDiscountRate();
	}

}
